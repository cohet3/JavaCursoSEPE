package javaIO.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio1FileReader {
    public static void main(String[] args) {
        //1. definir variables
        FileReader fEntrada = null;
        char[] buffer = new char[128];
        int longitudLeida= 0;
        //2. acciones entrada salida
        try {
            fEntrada = new FileReader("nombresEdades.txt");
//            longitudLeida= fEntrada.read(buffer);
            while (true){
                longitudLeida= fEntrada.read(buffer);
                if (longitudLeida== -1){
                    break;
                }
                System.out.println("El buffer tiene -> "+ Arrays.toString(buffer));
                System.out.println("La longitud es -> "+ longitudLeida);
            }
            fEntrada.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //3. cerrar las clases que gestionan stream
        //TAREA: mejorar el codigo para q lea hasta el final del archivo

    }
}
