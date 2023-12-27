package javaIO.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    //solicitar por consola 5 frases y escribirlas en un fichero con el nombre Diciembre23.txt

    public static void main(String[] args) {
        //1. declaramos variables
        //1.1 el nombre del ficchero
        Scanner sc = new Scanner(System.in);
        String [] frases= new String[5];
        String nombreFichero = "Diciembre23.txt";
        int i = 0;
        while (i < frases.length){
            frases[i] = sc.nextLine();
            i++;
            try {
                FileWriter fSalida = new FileWriter(nombreFichero);
                fSalida.write(Arrays.toString(frases));
                fSalida.flush();
                fSalida.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
