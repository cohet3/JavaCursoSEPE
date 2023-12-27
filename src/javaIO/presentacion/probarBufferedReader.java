package javaIO.presentacion;

import java.io.*;

public class probarBufferedReader {
    public static void main(String[] args) {
        //1. Declarar variables
        FileReader fEntrada = null;
        BufferedReader buffer = null;
        String linea = null;
        //2.Acciones e/S
        try {
            fEntrada = new FileReader("Buffered_writer.txt");
            buffer = new BufferedReader(fEntrada);
            while(true){
                linea = buffer.readLine();
                if(linea== null){
                    break;
                }
                System.out.println(linea);
            }
            //3. cierres de los flujos
            buffer.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
//contador con el numero de lineas que se han leido


    }
}
