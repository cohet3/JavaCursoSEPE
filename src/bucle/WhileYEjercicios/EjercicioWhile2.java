package bucle.WhileYEjercicios;

import java.util.Scanner;

public class EjercicioWhile2 {
    public static void main(String[] args) {
//        2. Leer números hasta que se introcuzca un 0. Para cada uno indicar si es par o impar
        //declarar variables
        //Primitivas
        int stop = 0;
        int entrada= 0;
        //instancia
        Scanner sr = new Scanner(System.in);
        String par = "Es Par";
        String impar = "Es Impar";
        while (true){
            entrada = sr.nextInt();
            if (entrada%2==0){
                System.out.println(par);
            }if (entrada%2!=0){
                System.out.println(impar);
            }if (entrada==0){
                break;
            }
        }
        System.out.println("se finalizo el programa con éxito");
    }
}
