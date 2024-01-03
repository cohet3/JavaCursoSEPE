package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //7. Pedir dos números y decir cual es el mayor.

        //1Declarar variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero A");
        n1 = sc.nextInt();
        System.out.println("introduce otro numero B ");
        n2 = sc.nextInt();
        if(n1 > n2 ){
            System.out.println("el numero A es mayor del número B");
        }else {
            System.out.println("el numero B es mayor del número A");
        }

    }
}
