package UD2;
public class EjemploSemana {
    public static void main(String[] args) {
        
        int nDia = (int)(Math.random()*7)+1;
        String Dia = " ";
        
        switch (nDia) {
            case 1:
                Dia = "Lunes :C";
                break;

            case 2:
                Dia = "Martes";
                break;

            case 3:
                Dia = "Miercoles";
                break;

            case 4:
                Dia = "Jueves";
                break;

            case 5:
                Dia = "Viernes";
                break;

            case 6:
            case 7:
                Dia = "Fin de semana!!";
                break;

            default:
                Dia = "Se ha liado, no deberias ver este mensaje";
                break;
        }
        System.err.println(nDia);
        System.out.println("Hoy es " + Dia);
    }
}
