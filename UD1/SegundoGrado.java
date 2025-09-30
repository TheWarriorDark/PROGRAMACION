package UD1;

import java.util.Scanner; //Librería para poder tomar datos por teclado


class SegundoGrado{
public static void main(String[] args)
{
    //Declaración de todas las variables necesarias
    float a = 0f;
    float b = 0f;
    float c = 0f;
    float raiz = 0f;
    double sol1 = 0;
    double sol2 = 0; 
    Scanner teclado = new Scanner(System.in); //Abrimos el teclado para poder empezara tomar los datos

    //Preguntamos las variables disponibles para la ecuacion a, b y c
    System.out.println("Introduce las siguiente letras de esta ecuacion ax2+bx+c: ");
    System.out.print("a: ");
    a = teclado.nextFloat();
    //Impedimos que divida entre 0 para futuros errores mediante un pequeño bucle
    while (a == 0) {
        System.out.print("Pisha a no puede ser 0 pon otra cosa, no tenga malaje: ");
        a = teclado.nextFloat();
        
    }
    System.out.print("b: ");
    b = teclado.nextFloat();
    System.out.print("c: ");
    c = teclado.nextFloat();

    //Calculamos el contenido de la raiz para verificaciones
    raiz = (b*b) - (4*a*c);


    /*Hacemos un condicional sobre las posibles soluciones 
    Si el contenido de la raiz es 0 tiene solo 1 y si es negativo no tiene solucion */

    if (raiz == 0){
        //Calculamos su unica solucion
        sol1 = -b /(2*a);
        System.out.println("Tiene una solucion y es " + sol1);

    }else if (raiz > 0){
        //Calculamos sus dos soluciones disponibles
        sol1 = (-b + Math.sqrt(raiz))/(2*a); 
        sol2 = (-b - Math.sqrt(raiz))/(2*a); 
        System.out.println("Tiene dos soluciones y son " + sol1 + " y " + sol2);
    }else{
        //Nos ahorramos el calculo porque no va a tener solucion
        System.out.println("No tiene solucion");

    }
    teclado.close(); //Cerramos el teclado por seguridad
}
}