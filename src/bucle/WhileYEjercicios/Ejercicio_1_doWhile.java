package bucle.WhileYEjercicios;

import java.util.Scanner;

public class Ejercicio_1_doWhile {
    public static void main(String[] args) {
        // sumar los numeros que se pidan por la consola
        // salir del bucle cunado se escriba un numero negativo

        //1. definir variables
        Scanner sc= new Scanner(System.in);
        int numero;
        int suma = 0;
        //2.bucle do while
        do {
            System.out.println("Escriba el numero (para salir ponga negativo)");
            numero= sc.nextInt();
            if (numero>=0){
            suma += numero;}
        }while (numero >= 0);
        System.out.println("Suma -> "+suma);
    }
}
