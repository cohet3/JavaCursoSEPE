package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio11 {
    //11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona un numero");
        n1 = sc.nextInt();
        if (n1 < 10){
            System.out.println("el número tiene 1 cifra");
        } else if (n1 < 100) {
            System.out.println("el numero tiene 2 cifras");

        }else if (n1 < 1000){
            System.out.println(" el número tiene 3 cifras");
        }else if (n1 < 10000){
        System.out.println(" el número tiene 4 cifras");
    }
    }
}
