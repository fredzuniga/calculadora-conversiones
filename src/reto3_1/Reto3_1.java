package reto3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3_1 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static String convertirDecimalToBinario(int valor){
        String binaryString = Integer.toBinaryString(valor);
        return binaryString;
    }
    
    public static String convertirDecimalToOctal(int numeroDecimal){
        String octalString = Integer.toOctalString(numeroDecimal);
        return octalString;
    }
    
    public static int convertirHexadecimalToDecimal(String valorHexadecimal){
        int decimal = Integer.parseInt(valorHexadecimal,16);
        return decimal;
    }
    
    public static int binarioADecimal(int binario) {
        int decimal = 0;
        int digito;
        final long DIVISOR = 10;
        for (int i = binario, j = 0; i > 0; i /= DIVISOR, j++) {
            digito = (int) (i % DIVISOR);
            if (digito != 0 && digito != 1) {
                return -1;
            }
            decimal += digito * Math.pow(2, j);
        }
        return decimal;
    }
    
    public static int convertirBinarioToDecimal(String binaryString){
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }
    
    
    public static int convertirOctalToDecimal(String octalString){
        int decimal=Integer.parseInt(octalString,8); 
        return decimal;
    }
    
    public static void main(String[] args) throws IOException {
        char opcion;
        char salir;
        String numero;
        int valorConversion;
        do{
            System.out.println("*** Programa de conversiones ***");
            System.out.println("a. Convertir de decimal a binario");
            System.out.println("b. Convertir de decimal a octal");
            System.out.println("c. Convertir de binario a decimal");
            System.out.println("d. Convertir de octal a decimal");
            System.out.println("e. Convertir de hexadecimal a decimal");
            System.out.print("Tipo de conversión: ");
            opcion = entrada.readLine().charAt(0);
            System.out.println("");
            System.out.print("Número a convertir? ");
            numero = entrada.readLine();
            switch(opcion){
                case 'a':
                    valorConversion = Integer.parseInt(numero);
                    System.out.println("El número " + valorConversion + " en base binario es : " + convertirDecimalToBinario(valorConversion));
                    break;
                case 'b':
                    valorConversion = Integer.parseInt(numero);
                    System.out.println("El número " + valorConversion + " en base octal es : " + convertirDecimalToOctal(valorConversion));
                    break;
                case 'c':
                    // 100
                    valorConversion = Integer.parseInt(numero);
                    System.out.println("El número " + valorConversion + " en base decimal es : " + binarioADecimal(valorConversion));
                    
                    
                    System.out.println("El número " + numero + " en base decimal es : " + convertirBinarioToDecimal(numero));
                    
                    break;
                case 'd':

                    System.out.println("El número " + numero + " en base decimal es : " + convertirOctalToDecimal(numero));
                    
                    break;
                case 'e':
                    valorConversion = convertirHexadecimalToDecimal(numero);
                    System.out.println("El número " + numero + " en base decimal es : " + valorConversion);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            System.out.println("Otra convesión (s/n) ? :");
            salir = entrada.readLine().charAt(0);
        }while(salir != 'n');
    }
    
    
    
}
