package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio1Bucle {
//    1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
//    negativo.

        public static void main(String[] args) {
            int num,cuadrado;
            // num guardará el número que leamos
            // y cuadrado guardará el cuadrado de num
            System.out.print("Introduzca número: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
                cuadrado=num*num;
                System.out.println(num+ "² es igual a "+ cuadrado);
                System.out.print("Introduzca otro número: ");
                num=sc.nextInt(); // volvemos a leer num
            }
        }
    }


