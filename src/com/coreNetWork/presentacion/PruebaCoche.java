package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Coche;

import java.util.Scanner;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche c1= new Coche();
        c1.color= "amarillo";
        c1.electrico= true;
        c1.modelo = "Sport";
        c1.numPuertas = 5;
        c1.tipoMotor="gasolina";
        c1.acelerar();
        c1.frenando();

        Coche c2= new Coche();
        c2.color= "Rojo";
        c2.electrico= false;
        c2.modelo = "Manual";
        c2.numPuertas = 3;
        c2.tipoMotor="TurboDiesel";
        c2.acelerar();
        c2.frenando();

        System.out.println(c2.tipoMotor);
    }
}
