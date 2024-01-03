package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //4. Pedir dos numeros y decir si son iguales o no
        //1.Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Introduce un numero -> ");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número -> ");
        n2 = sc.nextInt();
        if(n1 == n2){
            System.out.println("Los numero porporcionados son iguales ");
        }else{
            System.out.println("Los numeros proporcionanos NO son iguales");
        }
    }
}
