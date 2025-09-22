package UD1;

import java.util.Scanner;

public class EjemploOperadoresComparacion {

    public static void main(String[] args) {
        
        boolean puedeIrDelante = false;

        int altura = 0;

        Scanner teclado = new Scanner(System.in); //comienza la comunicación con el teclado

        System.out.print("Escribe la altura del ninio en cm: ");
        altura = teclado.nextInt(); //Coge lo que hemos introducido y lo mete en la variable altura
        
        if (altura >= 135){
            puedeIrDelante = true; 
        }

        System.out.println("La condición de si puede ir delante es: " + puedeIrDelante);

        teclado.close(); //cierra la comunicación con el teclado
    }
}