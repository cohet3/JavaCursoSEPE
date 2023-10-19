package bucle.WhileYEjercicios;

import java.util.Scanner;

public class Ejercicio3While {
    public static void main(String[] args) {
        //3. Pedir numeros hasta que se teclee uno negativo, y mostrarcuantos numeros se han introducido
        //declaramos variables
        //primitivas
        int numeros = 0;
        int cuantosNUmeros=0;
        //instancia
        Scanner sr = new Scanner(System.in);
        while (numeros>=0){
            System.out.println("Introduzca un número cualquiera y un numero negativo para salir");
            numeros= sr.nextInt();
            cuantosNUmeros++;
        }
        System.out.println("se han introducido "+cuantosNUmeros+"numeros");
    }
}
