package javaIO.presentacion;

import javaIO.presentacion.Mecanismos28_12_2023.modelo.Producto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProbarObjectReaderStream {
    public static void main(String[] args) {
        //Leer los objetos del fichero productos.dat
        //1. Declarar variables
        FileInputStream fEntrada;
        ObjectInputStream objeto;
        Producto p1= null;
        Producto p2 = null;
        //2 Acciones entrada/salida
        try {
            fEntrada = new FileInputStream("productos.dat");
            objeto= new ObjectInputStream(fEntrada);
            p1 = (Producto) objeto.readObject();
            System.out.println(p1.toString());
            p2 = (Producto) objeto.readObject();
            System.out.println(p2.toString());
            //3. cierre de flujos

            objeto.close();
            fEntrada.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

    }
}
