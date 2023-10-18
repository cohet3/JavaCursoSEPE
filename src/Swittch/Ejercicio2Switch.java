package Swittch;

import java.util.Scanner;

public class Ejercicio2Switch {
    public static void main(String[] args) {
        // 2. Pedir el dia , mes y año de una fecha e indicar si la fecha es correcta. suponiendo todos los meses de 30 dias
        Scanner scanner = new Scanner(System.in);
        int dia = 0;
        int mes= 0;
        int ano = 0;
        System.out.println("introduce un día");
        dia = scanner.nextInt();
        System.out.println("introduce un mes");
        mes = scanner.nextInt();
        System.out.println("introduce un año");
        ano = scanner.nextInt();

        switch (dia){
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30:
                System.out.println("día correcto");
                break;
            default:
                System.out.println("introduce un valor valido para el dia");
        }
        switch (mes){
            case 1,2,3,4,5,6,7,8,9,10,11,12:
                System.out.println("mes correcto");
                break;
            default:
                System.out.println("introduce un mes valido");
        }
        System.out.println(dia +" -" + mes + " - " + ano + " La fecha proporcionada es correcta ");
    }
}
