package EjerciciosLibro.VariablesyCondicionales;

import java.util.Scanner;

public class Ejercicio2Pag7 {
    public static void main(String[] args) {
        //2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
//        3. Pedir el radio de una circunferencia y calcular su longitud.
        //1 declaracion de variables
        double a;
        double r;
        double l;
        Scanner sc= new Scanner(System.in);

        System.out.println("introduce el radio de un circulo: Sí es un numemero decimal asegurate de introducirlo con , ");
        r=sc.nextDouble();
        a=Math.PI*(r*r);
        l=2*Math.PI*r;
        System.out.println("El area de una circunferencia de radio "+r+" es: "+ a);
        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}
