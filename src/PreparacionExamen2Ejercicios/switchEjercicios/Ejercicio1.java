package PreparacionExamen2Ejercicios.switchEjercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        String diaDeSemana;
        int numero=4;
        switch (numero){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercolés");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número no corresponde con ningún día de la semana :(");
        }



    }
}
