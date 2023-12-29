package com.corenetworks.presentacion;

import com.corenetworks.modelo.Contador;

public class ProbarContador {
    public static void main(String[] args) {
        System.out.println("Valor contador = "+ Contador.contador);
        Contador c1 = new Contador();
        System.out.println(c1.getSerialNumber());
        Contador c2 = new Contador();
        System.out.println(c2.getSerialNumber());
        Contador c3 = new Contador();
        System.out.println(c3.getSerialNumber());
    }
}
