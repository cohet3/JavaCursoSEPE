package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio9 {
    //9.Pedir dos números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) {
        //1.Declaracion de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número A");
        n1= sc.nextInt();
        System.out.println("Introduce un número B");
        n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("El orden de los números es -> "+n1+" "+n2);
        }else {
            System.out.println("El orden de los números es -> "+n2+" "+n1);
        }
    }
}
