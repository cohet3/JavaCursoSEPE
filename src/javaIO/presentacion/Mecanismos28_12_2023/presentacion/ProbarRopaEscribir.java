package javaIO.presentacion.Mecanismos28_12_2023.presentacion;

import javaIO.presentacion.Mecanismos28_12_2023.modelo.Camisa;
import javaIO.presentacion.Mecanismos28_12_2023.modelo.Pantalon;
import javaIO.presentacion.Mecanismos28_12_2023.modelo.Zapatos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProbarRopaEscribir {
   /* public static void main(String[] args) {
        //1.declarar variables
        FileOutputStream fSalida;
        ObjectOutputStream objeto;
        Pantalon p2;
        Camisa c1;
        Zapatos z1;
        Zapatos z2;
        //2. Accciones e/s
        try {
            fSalida =new FileOutputStream("ropa.dat");
            objeto= new ObjectOutputStream(fSalida);

            p2 = new Pantalon("vaquero");
            objeto.writeObject(p2);

            c1= new Camisa(true, 38.2);
            objeto.writeObject(c1);

            z1 = new Zapatos(5);
            objeto.writeObject(z1);

            z2 = new Zapatos(7);
            objeto.writeObject(z2);

            //3.Cerrar
            objeto.flush();
            objeto.close();
            fSalida.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }*/
}
