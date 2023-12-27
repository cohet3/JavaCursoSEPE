package javaIO.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio8LecturaFIleOutPut {
    public static void main(String[] args) {
        FileOutputStream fSalida;
        DataOutputStream dato;
        try {
            //1. Instanciar un FileOutputStream
            fSalida = new FileOutputStream("primitivos.dat", false);

            //2. DataOutPutStream
            dato = new DataOutputStream(fSalida);
            //3. Escribie en flujo de datos cada uno de los datos primitivos
            byte vByte =5;
            dato.writeByte(vByte);
            int vInt = 10;
            dato.writeInt(vInt);
            short vShort = 15;
            dato.writeShort(vShort);
            long vLong = 20L;
            dato.writeLong(vLong);
            float vFloat = 25f;
            dato.writeFloat(vFloat);
            double vDouble = 30;
            dato.writeDouble(vDouble);
            //4. Cerrar el flujo de datos
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
