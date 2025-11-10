package UD2;

public class EjemploArrays {
    public static void main(String[] args) {
        String[] calcetines = {"Marron","Rojo","Verde","Negro","Rojo"};

        String nombre = "Pedro";

        System.out.println("Mi nombre es " + nombre + " Y el calcetín que se me ha perdido es el cuarto: " + calcetines[3]);

        System.out.println("Hay " + calcetines.length + " calcetines sin pareja");

        int minimo = Integer.MAX_VALUE;

        int maximo = Integer.MIN_VALUE;

        float media = 0;

        calcetines[4] = "Amarillo"; //Cambiamos el segundo calcetín rojo por el amarillo.

        //Creamos un array de numeros aleatorios y calculamos sus estadisticas.

        int[] numeros_aleatorios = new int[10];

        //Recorremos todas las posiciones del array y lo llegamos de números como el pavo de navidad.

        for (int i=0; i<numeros_aleatorios.length ; i++){

            numeros_aleatorios[i] = (int)(Math.random()*100)+1;
            System.out.println("Numero en posición: " + i + " Es: " + numeros_aleatorios[i]);


        }

        for (int numero : numeros_aleatorios){ //For each para recorrer un array

            if (numero < minimo){
                minimo = numero;
            }

            if (numero > maximo){
                maximo = numero;
            }

            media+= numero;
        }
        
        System.out.println("La medía es de: " + (media/numeros_aleatorios.length));
        System.out.println("Él número más alto es: " + maximo);
        System.out.println("Él número más bajo es: " + minimo);
        
    }
}
