package ArraysTeoriaEjemplos;

import java.util.Scanner;

public class Ejercicio10Arrays {
    public static void main(String[] args) {
        // definir un array de String de 3 elementos
        //perdir por consola los tres elementos de la consola
        //1. definir variables
        String[] palabras= new String[3];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i<palabras.length; i++){
            palabras[i]=sc.nextLine();
        }
        for (String elemento: palabras){
            System.out.println("contenido del array  ->"+elemento);
        }

    }
}
