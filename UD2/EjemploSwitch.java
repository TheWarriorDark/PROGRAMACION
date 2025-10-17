package UD2;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int codPostal = 0;

        System.out.print("Introduce los dos primeros digitos del código postal de tu ciudad y te digo la comunidad autonoma: ");
        //Leemos el código postal
        codPostal = teclado.nextInt();

        switch (codPostal) {
            case 28:
                System.out.println("Eres de Madrid");
                break;
            
            case 8:
                System.out.println("Eres de Barcelona");
                break;
    
            case 51:
                System.out.println("Eres de Ceuta");
                break;

            case 52:
                System.out.println("Eres de Melilla");
                break;

            case 1:
                System.out.println("Eres de Alava");
                break;

            case 50:
                System.out.println("Eres de Zaragoza");
                break;

            case 11:
                System.out.println("Eres de Cadíz");
                break;

            default:
                System.out.println("Eres de Tonto");
                break;
        }

        teclado.close();
    }
    
}
