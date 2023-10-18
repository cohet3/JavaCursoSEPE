package bucles.FOR_ejercicios;

import java.util.Scanner;

public class Ejercicio3For {
    public static void main(String[] args) {
//        3.	Pedir 5 números y escribir la suma total
        //definicion de variables
        // Primitivas
        int numero = 0;
        int suma = 0;
        //Instancia
        Scanner sr = new Scanner(System.in);

     for( int i = 1; i <=5;  i++){
         System.out.println("Escribe el numero-> ");
         numero = sr.nextInt();
         suma = suma+numero;
         System.out.println("La suma variable ->"+suma);
     }
    }
}
