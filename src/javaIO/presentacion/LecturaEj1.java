package javaIO.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LecturaEj1 {
    public static void main(String[] args) {
        //definir variables
        char[] buffer = new char[128];
        int caracterLeido;
        try {
            FileReader fEntrada= new FileReader("frase.txt");
            caracterLeido = fEntrada.read(buffer);
            System.out.println("Caracteres leidos -> "+caracterLeido);
            System.out.println(Arrays.toString(buffer));
            while (caracterLeido !=-1){
                System.out.println("entra al bucle");
                caracterLeido= fEntrada.read(buffer);
                System.out.println(Arrays.toString(buffer));
            }
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
