package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int nota;
        System.out.print("Introduzca una nota: ");
        Scanner sc = new Scanner(System.in);
        nota=sc.nextInt();
// tanto los if's como los else's encierran a una sola instrucción
// y no es necesario utilizar llaves { }
        if(nota>=0 && nota<5)
            System.out.println("INSUFICIENTE");
        else
        if(nota==5)
            System.out.println("SUFICIENTE");
        else
        if(nota==6)
            System.out.println("BIEN");
        else
        if(nota==7 || nota==8)
            System.out.println("NOTABLE");
        else
        if(nota==9 || nota==10 )
            System.out.println("SOBRESALIENTE");
    }
}

