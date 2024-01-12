package javaIO.presentacion;

import java.io.*;

public class ejercicio8LecturaFIleInputStream {
    public static void main(String[] args) {
        FileInputStream fEntrada;
        DataInputStream dato;
        try {
            //1. Instanciar un FileOutputStream
            fEntrada = new FileInputStream("primitivos.dat");

            //2. DataOutPutStream
            dato = new DataInputStream(fEntrada);
            //3. Escribie en flujo de datos cada uno de los datos primitivos
            int vInt = 1;
            System.out.println("Entero ->" + dato.readInt());
            System.out.println("Double ->"+ dato.readDouble());
            System.out.println("Float ->"+ dato.readFloat());
            System.out.println("Long ->"+ dato.readLong());
            System.out.println("byte ->"+ dato.readByte());
            System.out.println("Short ->"+ dato.readShort());
            System.out.println("Char ->"+ dato.readChar());
            System.out.println("Boolean ->"+ dato.readBoolean());

            //4. Cerrar el flujo de datos
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
