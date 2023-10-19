package bucle.WhileYEjercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4While {
    public static void main(String[] args) {
//        4. Realizar un juego para adivinar un numero. Calacular el numero a adividar con la clase Ramdom(1al10),
//        y luego ir pidiendo numeros indicados mayor o menor
//        segun sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta
        //declaramos variables
        //primitivas
        int numeroAleatorio= 0;
        int numeroUser= 0;

        //instancia
        Random aleatorio= new Random();
        Scanner sr = new Scanner(System.in);
        numeroAleatorio = aleatorio.nextInt(1,10);
        numeroUser = sr.nextInt();
        while (true)
        if (numeroAleatorio==numeroUser){
            System.out.println("ganaste coincide tu numero con el de la maquina == "+numeroAleatorio+" == "+numeroUser+" NUmero user");
            break;
        }else {
            System.out.println("lo siente vuelve a intentarlo, número máquina =="+ numeroAleatorio);
            numeroUser = sr.nextInt();
        }

    }
}
