package UD1;

public class EjemploOperadoresAritmeticos {
    public static void main(String[] args) {
        
        int edadHijo = 9;
        int edadPadre = 37;
        int sumaEdades = edadHijo + edadPadre;
        int diferenciaEdades = edadPadre - edadHijo;
        int media = sumaEdades / 2;
        int dobleHijo = edadHijo * 2;
        int resto = 33 % 5; //El operador es el resto de la operación entera en este caso es 3 ya que es el resto.




        System.out.println("La suma de las edad es: " + sumaEdades);
        System.out.println("La diferencia de edad es de: " + diferenciaEdades);
        System.out.println("La media de las edades es de; " + media);
        System.out.println("El doble de la del hijo es: " + dobleHijo);
        System.out.println("El resto es de: " + resto);

        edadHijo += 10;

        System.out.println("En 10 anios el hijo tendra: " + edadHijo);

        edadHijo++;
        
        System.out.println("Y en un anio mas tendra: " + edadHijo);
        System.out.println("Prueba: X++ " + edadHijo++); //Primero se muestra, luego se suma.
        System.out.println("Prueba: ++X " + ++edadHijo); //Primero se suma, luego se muestra.
    }
}
