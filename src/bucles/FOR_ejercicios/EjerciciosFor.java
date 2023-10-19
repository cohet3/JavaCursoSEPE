package bucles.FOR_ejercicios;

import java.util.Scanner;

public class EjerciciosFor {
    public static void main(String[] args) {
    /*    1.	Pedir un número N, y mostrar todos los números del 1 al N.*/
        //paso 1. declaración de variables
        // primitivas
        int numero=0;
        //instancia
        Scanner scanner = new Scanner(System.in);
        //Pedir el numero y leerlo
        System.out.println("Escribe un numero -> ");
        numero = scanner.nextInt();
        for(int i = 1 ;i <= numero; i++ ){
            System.out.println(i);
        }


    }
}
