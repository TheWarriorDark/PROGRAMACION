package UD1;

import java.util.Scanner;

class SegundoGrado{
public static void main(String[] args)
{
    float a = 0f;
    float b = 0f;
    float c = 0f;
    float raiz = 0f;
    double sol1 = 0;
    double sol2 = 0; 
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce las siguiente letras de esta ecuacion ax2+bx+c: ");
    System.out.print("a: ");
    a = teclado.nextFloat();
    while (a == 0) {
        System.out.print("Pisha a no puede ser 0 pon otra cosa, no tenga malaje: ");
        a = teclado.nextFloat();
        
    }
    System.out.print("b: ");
    b = teclado.nextFloat();
    System.out.print("c: ");
    c = teclado.nextFloat();

    raiz = (b*b) - (4*a*c);

    if (raiz == 0){

        sol1 = -b /(2*a); 
        System.out.println("Tiene una solucion y es " + sol1);

    }else if (raiz > 0){

        sol1 = (-b + Math.sqrt(raiz))/(2*a); 
        sol2 = (-b - Math.sqrt(raiz))/(2*a); 
        System.out.println("Tiene dos soluciones y son " + sol1 + " y " + sol2);
    }else{
        System.out.println("No tiene solucion");

    }
    teclado.close();
}
}