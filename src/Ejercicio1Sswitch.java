import java.util.Scanner;

public class Ejercicio1Sswitch {
    public static void main(String[] args) {
        // 1. Pedir una nota de 0 a 10 y mostrarla de la forma : insuficiente , suficiente, bien...


        // 4. Pedir el dia , mes y año de una fecha correcta y mostrar la fecha del dia siguiente suponer que todos los meses tienen 30 dias
        // 5. pedir una nota numerica entera entre 0 y 10, y mostrar dicha nota de la forma cero, uno , dos, tres..
        //6. pedir un numero 9 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        nota = scanner.nextInt();

        switch (nota){
            case 1,2,3,4:
                System.out.println("insuficiente");
                break;
            case 5,6:
                System.out.println("aprovado");
                break;
            case 7,8:
                System.out.println("notable");
                break;
            case 9,10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("El valor es invalido");
        }
    }
}
