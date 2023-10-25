package BucleFor;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EjemploForEach {
    public static void main(String[] args) {
        int [] numeros = { 3,4,1,5,6,7};
        //recorrer la colección
        for (int elemento: numeros){
            System.out.println(elemento);
        }
        String[] palabras= {"casa", "coche", "aula", "ordenador"};
        //recorrer y mostrar en consola
        for (String elemento: palabras){
            System.out.println(elemento);
        }
        char [] letras = {'a','b','c','d'};
        for (char elemento: letras){
            System.out.println(elemento);
        }
        double [] sueldos = {1500, 1000, 1200, 1300};
        double suma = 0;
        for (double elemento : sueldos){
            suma += elemento;
        }
        System.out.println("La suma sueldos es -> " +suma);
       /* int [] datos= new int[5];
        Scanner sc= new Scanner(System.in);
        int i = 0;
        for (int elemento: datos){
            System.out.println("Escriba el numero");
            datos[i] = sc.nextInt();
            i++;
        }
        for (int elemento: datos){
            System.out.println(elemento);
        }
        Seria recomendable usar otro bucle distinto*/
    }
}
