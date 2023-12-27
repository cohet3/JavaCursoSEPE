package javaIO.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio8OutputStream {
    //declarar una variable para cada tipo primitivo y escribirlo en un fichero primitivos.dat

    public static void main(String[] args) {
        //1. declarar variables
        FileOutputStream fSalida = null;
        DataOutputStream buffer = null;
        int num = 1;
        double money= 300.5D;
        float decimal = 20.33F;
        long numGrande= 231231231;
        byte num2= 2;
        short jordan =23;
        char sexo = 'm';
        boolean positivo= true;
        //2.acciones
        try {
            fSalida= new FileOutputStream("primitivos.dat");
            //podemos pasar un segundo parametro True para sobreescribir
            buffer = new DataOutputStream(fSalida);

            buffer.writeInt(num);
            buffer.writeInt(num2);
            buffer.writeInt(jordan);
            buffer.writeDouble(money);
            buffer.writeFloat(decimal);
            buffer.writeLong(numGrande);
            buffer.writeChar(sexo);
            buffer.writeBoolean(positivo);

            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }}
