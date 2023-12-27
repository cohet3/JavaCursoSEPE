package javaIO.presentacion;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Solicitar por consola el nombre y la edad de una persona 5 NOMBRES Y 5 EDADES
        //En el fichero de salida deberá salir
/*        NOMBRE                 EDAD
       XXXXXXXX              XXXXXXX
       XXXXXXXX              XXXXXXX*/
        //1. declaramos variables
        //1.1 el nombre del ficchero
        Scanner sc = new Scanner(System.in);
        String [] nombres= new String[5];
        int [] edades = new int [5];
        int [] notas = new int [5];
        String nombreFichero = "nombresEdades.txt";
        int i = 0;

        while (i < nombres.length){
            System.out.println("introduce un nombre ");
            nombres[i] = sc.nextLine();
            System.out.println("introduce una edad");
            edades[i]= sc.nextInt();
            sc.nextLine();
            System.out.println("introduce una Nota");
            notas[i]= sc.nextInt();
            sc.nextLine();
            i++;

        }
        try {
            FileWriter fSalida = new FileWriter(nombreFichero);
            fSalida.write("NOMBRE\t\t\t\tEDAD\t\t\t\tNOTAS\n");
            int sumaNotas = 0;
            int sumaEdad = 0;

            for (int j = 0; j < nombres.length; j++) {
                fSalida.write(String.format("%-20s%-20d%-10d\n", nombres[j], edades[j], notas[j]));
                sumaNotas += notas[j];
                sumaEdad += edades[j];
            }
            double promedioNotas = (double) sumaNotas / nombres.length;
            double promedioedad = (double) sumaEdad / nombres.length;
            fSalida.write("\nPromedio de Notas: " + promedioNotas);
            fSalida.write("\nPromedio de Edad: " + promedioedad);
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //insertar un dato mas Nota una columna mas y los promedios
    }
}
