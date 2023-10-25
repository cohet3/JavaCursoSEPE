package com.coreNetWork.modelos;

public class Coche {
    //Declaración de atributos: son 4 public, private, protected, default
    public String color;
    public String tipoMotor;
    public int numPuertas;
    public String modelo;
    public boolean electrico;

    public void acelerar(){
        System.out.println("El coche esta acelerando");
    }
    public void frenando(){
        System.out.println("El coche esta frenando");
    }
}
