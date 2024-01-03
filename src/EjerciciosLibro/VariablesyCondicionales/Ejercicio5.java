package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //5. Pedir un número e indicar si es positivo o negativo.
        //1.Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num;
        //2.
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Es Par");
        }else {
            System.out.println("Es Impar");
        }

    }
}
