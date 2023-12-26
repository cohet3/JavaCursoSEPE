package javaIO.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbarFileWriter {
    public static void main(String[] args) {
        //1. declaramos variables
        //1.1 el nombre del ficchero
        String nombreFichero = "salida.txt";
        //1.2 la segundo variable es el fichero FileWriter
        //1.3 despues de hacer referencia lo envolvemos en un trycatch
        try {
            FileWriter fSalida = new FileWriter(nombreFichero);
            fSalida.write("Escribiendo desde java en un fichero plano");
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.
    }
}
