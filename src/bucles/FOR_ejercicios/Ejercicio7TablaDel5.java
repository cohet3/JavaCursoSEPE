package bucles.FOR_ejercicios;

import java.util.Scanner;

public class Ejercicio7TablaDel5 {
    public static void main(String[] args) {
        //la tabla del numero que se lee por consola
        Scanner sr = new Scanner(System.in);
        System.out.println("Escribe el numero de la tabla al mostar");
        int tabla= sr.nextInt();
        for (int y = 1; y<=10; y++){
            System.out.println(tabla + " * "+ y + " = " +tabla*y);
        }
    }
}
