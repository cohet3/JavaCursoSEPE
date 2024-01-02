package javaIO.presentacion.corenetworks.presentacion;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriterFIle {
    public static void main(String[] args) {
        //1.definicion de variables
        File fSalida = new File("print_writer_1.txt");
        try (PrintWriter altoNivel = new PrintWriter(fSalida);){
            altoNivel.println("Escrito desde un PrintWriter");
            altoNivel.format("El nombre del producto %-20s tiene un precio %.2f y hay %d unidades","te tai", 1.333,50, 50);
            altoNivel.flush();
            altoNivel.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
