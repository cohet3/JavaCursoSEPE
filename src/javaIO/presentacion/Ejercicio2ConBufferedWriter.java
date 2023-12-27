package javaIO.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2ConBufferedWriter {
    public static void main(String[] args) {
        //1. declaramos variables
        //1.1 el nombre del ficchero
        Scanner sc = new Scanner(System.in);
        String [] frases= new String[5];
        String nombreFichero = "Diciembre23.txt";
        FileWriter fSalida = null;
        BufferedWriter buffer = null;
        int i = 0;
        System.out.println("introduce 5 frases: ");
        while (i < frases.length){
            frases[i] = sc.nextLine();
            i++;
            try {
                fSalida = new FileWriter(nombreFichero);
                buffer = new BufferedWriter(fSalida);
                buffer.write("usando el buffered Writter....");

                fSalida.write(Arrays.toString(frases));
                //3. cerramos los flujos
                buffer.flush();
                buffer.close();
                fSalida.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
