package UD1;

import java.util.Scanner; //Librería para poder tomar datos por teclado

class Circulo{
public static void main(String[] args)
{
    float radio = 0f;
    float pi = 3.14159265359f;
    Scanner teclado = new Scanner(System.in); //Abrimos el teclado para poder empezara tomar los datos
    System.out.print("Introduce el radio del circulo (cm): ");
    radio = teclado.nextFloat(); //Introducimos el radio en cm para el siguiente calculo

    System.out.println("El area del circulo es de " + (radio*radio*pi) + " cm2"); //Calculamos el area dentro del print para no hacer mas largo el codigo


    teclado.close(); //Cerramos el teclado por seguridad
}
}
