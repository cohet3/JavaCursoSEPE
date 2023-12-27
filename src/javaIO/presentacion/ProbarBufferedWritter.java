package javaIO.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarBufferedWritter {
    public static void main(String[] args) {
        //1.declarar variables
        FileWriter fSalida = null;
        BufferedWriter buffer = null;
        //2. Acciones de entrada y salida
        try {
            fSalida  = new FileWriter("Buffered_writer.txt");
            buffer = new BufferedWriter(fSalida);
            buffer.write("usando bufferedWriter ...");
            ///3. cerrar los flujos
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
