package UD2;

import java.util.Scanner;

public class BuscaMinas {
    public static void main(String[] args) {
        
        /*Definimos el mapa del buscaminas de 3x3, de cara a entenderlo se puede interpretar que cada elemento de la primera dimensión
        * Es a su vez un array, es decir el mapa [0] no es un número es el 0+[]
        * Para el hundir la flota es igual pero de caracteres y 8 posiciones.
        */
        int[][] mapaBombas =  {{0,0,1},{0,1,0},{0,0,0}};
        int[][] mapaJugador =  {{9,9,9},{9,9,9},{9,9,9}};
        int cantBombas = 0; //variable para contar las bombas
        Scanner teclado = new Scanner(System.in);

        System.out.println("En que posiciones quieres comprobar (X Y)");

        int posx = teclado.nextInt();
        int posy = teclado.nextInt();

        //Si hay una bomba en esa posiciones explota y se acabo, haber usado un robor o un perro, no el dedo.
        if(mapaBombas[posy][posx]==1){
            System.out.println("Bomba");
        }else{
            /**
             * Recorremos con la i las posiciones anteriores y posteriores a la introducida (posx).
             * y con la j las verticales (posy). 
             */
            for(int i = posx-1; i<=posx+1 ; i++){
                for (int j = posy-1; j<=posy+1; j++){
                    //Si en las coordenadas i y j hay un 1 implica que hay una bomba, incrementamos la cantidad de bombas.
                    if (i>=0 && i<=2 && j>=0 && j<=2){
                    if (mapaBombas[j][i] == 1) cantBombas++;
                    }
                }
            }
            System.out.println("Cerca de esa posición (" + posx + "," + posy + ") hay " + cantBombas + " bombas.");

        }
        teclado.close();
    }
}
