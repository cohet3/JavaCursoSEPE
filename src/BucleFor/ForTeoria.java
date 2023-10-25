package BucleFor;

import java.util.Scanner;

public class ForTeoria {
    public static void main(String[] args) {
        char[] letras = new char [5];
        //definir el scanner
        Scanner teclado= new Scanner(System.in);
//guardar los datos en el array
        for (int i =0; i< letras.length; i++){
            System.out.println("introduce una letra");
        letras[i]= teclado.next().charAt(0);
        }
        //mostrar los datos almacenados un bucle tanto como para guardarlos y otro para leerlos
        for (int i = 0; i<letras.length; i++){
            System.out.println(letras[i]);
        }
    }
}
