package javaIO.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    //Leer por consola una línea y escribirlo en un fichero de salida llamado frase.txt

    public static void main(String[] args) {
        //1. declaramos variables
        //1.1 el nombre del ficchero
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String nombreFichero = "frase.txt";
        //1.2 la segundo variable es el fichero FileWriter
        //1.3 despues de hacer referencia lo envolvemos en un trycatch
        try {
            FileWriter fSalida = new FileWriter(nombreFichero);
            fSalida.write(frase);
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
