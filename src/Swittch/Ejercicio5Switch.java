package Swittch;

import java.util.Scanner;

public class Ejercicio5Switch {
    public static void main(String[] args) {
        // 5. pedir una nota numerica entera entre 0 y 10, y mostrar dicha nota de la forma cero, uno , dos, tres..
        Scanner scanner= new Scanner(System.in);
        int nota= 0;
        nota = scanner.nextInt();
        switch (nota) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("la nota no es valida");
        }
    }
}
