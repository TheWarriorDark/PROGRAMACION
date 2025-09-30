package UD1;

import java.util.Scanner;//Librería para poder tomar datos por teclado

class Sueldo{
public static void main(String[] args)
{
    float sueldo = 0f;
    int impuestos = 0;
    float neto = 0f;
    Scanner teclado = new Scanner(System.in); //Abrimos el teclado para poder empezara tomar los datos
    //Preguntamos el sueldo bruto
    System.out.print("Tu sueldo bruto es de: ");
    sueldo = teclado.nextFloat();
    //Preguntamos el % de impuestos
     System.out.print("Porcentaje de impuestos a pagar: ");
    impuestos = teclado.nextInt();

    //Hacemos el calculo y luego lo mostramos por pantalla.
    neto = sueldo - ((sueldo * impuestos)/100);
    System.out.println("Cobras " +  sueldo + " euros pero hacienda se lleva " + impuestos + "% por lo cual te quedan unos miseros " + neto + " euros");

    teclado.close(); //Cerramos el teclado por seguridad
}
}
