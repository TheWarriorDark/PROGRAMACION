package UD2;

public class EjemplosWhile {

    public static void main(String[] args) {
        
    

    int random = 0;
    int i = 1;
    float media = 0f;

    while (i <= 10){

        random = (int) ((Math.random()*48)+18);
        System.out.println("la edad de esta persona es: " + random);
        media += random;
        i++;
    }

    System.err.println("la media de la edad es de: " + (media/10));
 }
}
