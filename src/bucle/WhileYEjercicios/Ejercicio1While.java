package bucle.WhileYEjercicios;

import java.util.Scanner;

public class Ejercicio1While {
    public static void main(String[] args) {
        //1 leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
        //declarar variables
        //primitivas
        int numero= 0;
        //Instancia
        Scanner sr = new Scanner(System.in);

       //estructuras de control
         while (true){
            //Solicitar el número
            System.out.println("Escribir un numero y cuando quiera salir escriba un negativo");
            numero = sr.nextInt();
            if (numero>=0){
             System.out.println("el cuadrado de " + numero + " es "+(numero*numero));
             System.out.println("El cuadrado de " + numero + " es " + Math.pow(numero, 2));
            }else{
                System.out.println("Gracias ...");
                break;
            }
        }
    }
}
