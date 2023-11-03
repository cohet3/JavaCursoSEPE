package EjerciciosLibro.VariablesyCondicionales;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Crear un programa que genere un numero al al azar para la lotería de eurodreams
        //6 numeros random del 1 al 40
        //1 estrella del 1 al 5
////        //declarar variables
//        int estrella= 0;
//
//        int [] numeros= new int [6];
//        Random numeroAleatorio = new Random();
//
//        //genero la estrella usando la clase random
//        estrella= numeroAleatorio.nextInt(1,5);
//        // un bucle para rellenar el array de numeros
//        for (int i = 0; i<numeros.length; i++){
//            numeros[i]=numeroAleatorio.nextInt(1,40);
//        }
//        //otro bucle para leerlos
//        for (int elemento: numeros){
//            System.out.println("los numeros ganadores son "+ elemento);
//        }
//        //un sout mas para imprimirlos
//        System.out.println("la estrella es -> "+ estrella);
        //añadir validación para que no se repita los numeros random
        backendEjercicio3 sorteo = new backendEjercicio3();
        System.out.println("hola, bienvenido al generador de ganadores");
//        System.out.println("introduce la cantidad de combinaciones que quieres ver");
        sorteo.numeroAleatorio();
        sorteo.contador();
        System.out.println(sorteo.toString());

        sorteo.numeroAleatorio();
        sorteo.contador();
        System.out.println(sorteo.toString());

        sorteo.numeroAleatorio();
        sorteo.contador();
        System.out.println(sorteo.toString());

        sorteo.numeroAleatorio();
        sorteo.contador();
        System.out.println(sorteo.toString());

        sorteo.numeroAleatorio();
        sorteo.contador();
        System.out.println(sorteo.toString());




//        int numoer = sorteo.getNumero();
//        System.out.println(sorteo.getNumero());
//        for (int i=0; i>sorteo.getNumero();i++){
//            sorteo.numeroAleatorio();
//            sorteo.contador();
//            System.out.println(sorteo.toString());
//
//        }

    }
}
