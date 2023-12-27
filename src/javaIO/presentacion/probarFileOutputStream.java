package javaIO.presentacion;

import java.io.*;

public class probarFileOutputStream {
    public static void main(String[] args) {
        //1. declarar variables
        FileOutputStream fSalida = null;
        DataOutputStream buffer = null;
        int contador = 5;
        //2. Acciones E/S
        try {
            fSalida= new FileOutputStream("Datos.dat");
            buffer = new DataOutputStream(fSalida);
            buffer.writeInt(contador);
            //3. Cerrar los flujos
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
