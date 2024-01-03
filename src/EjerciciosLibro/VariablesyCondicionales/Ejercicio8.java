package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio8 {
    //8. Pedir dos números y decir cual es el mayor o si son iguales.
    public static void main(String[] args) {
        //1.Declaracion de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número A");
        n1= sc.nextInt();
        System.out.println("Introduce un número B");
        n2 = sc.nextInt();
        if (n1 == n2){
            System.out.println("LOs número A y B son iguales");
        } else if (n1>n2) {
            System.out.println("El número a es mayor que el numero B");
        }else {
            System.out.println("El numero B es mayor que el A");
        }
    }
}
