package PreparacionExamen2Ejercicios.switchEjercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        int nota= 0;
        switch (nota){
            case 0,1,2,3,4,5:
                System.out.println("Suspenso");
                break;
            case 6,7,8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
        }
    }
}
