package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio10 {
    //10. Pedir tres números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) {
        //1.Declaracion de variables
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número A");
        n1= sc.nextInt();
        System.out.println("Introduce un número B");
        n2 = sc.nextInt();
        System.out.println("Introduce un número C");
        n3 = sc.nextInt();
        if (n1>n2 && n2>n3){
            System.out.println("El orden de los números es -> "+n1+" "+n2 +" "+n3);

        }else if(n1> n3 && n3> n2) {
            System.out.println("El orden de los números es -> "+n2+" "+n3+" "+n2);
        }else if( n2> n1 &&  n1>n3){
            System.out.println("El orden de los números es -> "+n2+" "+n1+" "+n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println("El orden de los números es -> "+n2 +" "+n3 +" "+ n2);
        }else if (n3> n1 && n1> n2){
            System.out.println("El orden de los números es -> "+n3 +" "+n1 +" "+ n2);
        }else if (n3> n2 && n2 > n1){
            System.out.println("El orden de los números es -> "+n3 +" "+n2 +" "+ n1);;
        }
    }
}
