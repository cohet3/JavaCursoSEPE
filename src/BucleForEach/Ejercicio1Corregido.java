package BucleForEach;

import java.util.Scanner;

public class Ejercicio1Corregido {
    public static void main(String[] args) {
        // Crear un bloque de codigo que pinte las vocales
        //y solo las vocalas que existen un array de caracteres
        //el programa debe de ir comprobando con un bucle
        // para determinar si cada caracter del array es o no una vocal

        // 1. Definicion de variables
        char [] vocales= {'a','e','i','o','g'};

        //estructuras un array y dentro un switch
        for (int i = 0; i< vocales.length; i++){
            switch (vocales[i]){// valores[i] sirve para leer cada una de las variables del array
                case 'a','A':

                case 'e', 'E':

                case 'I', 'i':

                case 'o', 'O':

                case 'u', 'U':
                    System.out.println("es una vocal  =" +vocales[i]+" esta en la posicion"+i);
                    break;
                default:
                    System.out.println("el valor no es una vocal =" +vocales[i]+"esta en la posicion"+i );
            }

        }
    }
}
