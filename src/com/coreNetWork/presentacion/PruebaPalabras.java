package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Palabras;

import java.util.Scanner;

public class PruebaPalabras {
    public static void main(String[] args) {
        //pedir el numero de palabras a leer por consola
        // leer por consola
        //cada uno de los elementos
        //1.declaración de variables
        Scanner sc= new Scanner(System.in);

        Palabras p1=new Palabras();
        int elemento;
        System.out.println("escriba el numero de palabras =3 ");
        elemento = sc.nextInt();
        p1.palabra(elemento);
        System.out.println("escribe tres palabras");
        p1.actualizaElemento(sc.nextLine(),0);
        p1.actualizaElemento(sc.nextLine(),1);
        p1.actualizaElemento(sc.nextLine(),2);
        System.out.println(p1.toString());
    }
}
