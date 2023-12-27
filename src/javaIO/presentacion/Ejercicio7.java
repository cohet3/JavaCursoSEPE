package javaIO.presentacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
        //1. Declarar variables
        FileReader fEntrada = null;
        BufferedReader buffer = null;
        String linea = null;
        int contador =0;
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
                contador++;
            }
            //3. cierres de los flujos
            System.out.println(" contador de lineas-> "+contador);
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
