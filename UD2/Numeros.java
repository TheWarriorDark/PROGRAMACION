package UD2;
public class Numeros {
    public static void main(String[] args) {
    /*
     * Para usar los argumentos se tendria que hacer lo siguiente:
     * int X = Integer.parseInt(args[0]); siento actualmente 0 el primer argumento
     * 
     */
  
        int N1 = (int) (Math.random()*101);
        int N2 = (int) (Math.random()*101);
        int N3 = (int) (Math.random()*101);
        int Mayor = 0;

        if (N1>=N2){
            if (N1>=N3){
                Mayor = N1;
            }else {
                Mayor = N3;
            }

        }else{
            if (N2>=N3){
                Mayor = N2;
            }else {
                Mayor = N3;
            }
        }

        System.out.println(N1 + " " + N2 + " " +3);
        System.out.println("El mayor es " + Mayor);


    }

}
