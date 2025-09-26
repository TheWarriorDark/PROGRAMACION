package UD1;

import java.util.Scanner;

public class EjemploOperadoresComparacion {

    public static void main(String[] args) {
        
        boolean puedeIrDelante = false;

        //En una linea se pueden declarar variables del mismo tipo.
        int altura, edad = 0;

        Scanner teclado = new Scanner(System.in); //comienza la comunicación con el teclado.

        System.out.print("Escribe la altura del ninio en cm: ");
        altura = teclado.nextInt(); //Coge lo que hemos introducido y lo mete en la variable altura.
        
        System.out.print("Escribe la edad: ");
        edad = teclado.nextInt(); //Coge lo que hemos introducido y lo mete en la variable altura.

        if (altura >= 135 || edad >= 10  ){
            puedeIrDelante = true; 
        }

        System.out.println("La condicion de si puede ir delante es: " + puedeIrDelante);

        /*
         * Icaro para poder volar desde la isla de creta hasta atenas necesitaba
         * Pesar menos de 80.5 kg y cumplir una de las siguientes dos condiciones
         * Hacer caso a su padre o tener mas de rango 5 en google fit
         */

         float pesoIcaro = 80.4f;
         boolean casoPadre = false;
         int rangoGoogleFit = 10;

         if (pesoIcaro < 80.5 && (casoPadre == true || rangoGoogleFit > 5)){

            System.out.println("Llego a Atenas");

         } else {

            System.out.println("No llego a Atenas");
         }

         /*
          * Para volver a por las llaves que se le habían olvidado en el laberinto
          * Tiene que hacer caso a su padre y su pero sea distinto de 90 kgs
          * o solo con tener un nivel de google fit mayor a 10 tambien valdría
          */

         if (rangoGoogleFit > 10 || (pesoIcaro != 90 || casoPadre == true)){

            System.out.println("consiguio las llaves");

         } else {

            System.out.println("No las consiguio :c");
         }

        teclado.close(); //cierra la comunicación con el teclado.
    }
}
