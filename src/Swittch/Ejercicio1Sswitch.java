package Swittch;

import java.util.Scanner;

public class Ejercicio1Sswitch {
    public static void main(String[] args) {
        // 1. Pedir una nota de 0 a 10 y mostrarla de la forma : insuficiente , suficiente, bien...
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
