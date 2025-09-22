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




        System.err.println("La suma de las edad es: " + sumaEdades);
        System.err.println("La diferencia de edad es de: " + diferenciaEdades);
        System.err.println("La media de las edades es de; " + media);
        System.err.println("El doble de la del hijo es: " + dobleHijo);
        System.err.println("El resto es de: " + resto);

        edadHijo += 10;

        System.err.println("En 10 anios el hijo tendra: " + edadHijo);

        edadHijo++;
        
        System.err.println("Y en un anio mas tendra: " + edadHijo);
        System.err.println("Prueba: X++ " + edadHijo++); //Primero se muestra, luego se suma.
        System.err.println("Prueba: ++X " + ++edadHijo); //Primero se suma, luego se muestra.
    }
}
