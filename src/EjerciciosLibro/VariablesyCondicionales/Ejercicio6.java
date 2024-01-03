package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //6. Pedir dos números y decir si uno es múltiplo del otro.
        //1Declarar variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero A");
        n1 = sc.nextInt();
        System.out.println("introduce otro numero B ");
        n2 = sc.nextInt();
        if(n1 % n2 == 0){
            System.out.println("el numero A es multiplo del número B");
        }else {
            System.out.println("No son multiplo");
        }
    }
}
