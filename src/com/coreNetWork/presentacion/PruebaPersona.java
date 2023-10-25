package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1= new Persona();
        p1.Nombre= "pepito";
        p1.Altura = 1.79;
        p1.Dni = "000000R";
        p1.ColorPelo="braun";
        p1.Genero= 'M';
        p1.EstadoCivil= 'C';
        p1.Peso = 80;

        Persona p2= new Persona();
        p2.Nombre= "Alimaña";
        p2.Altura = 1.69;
        p2.Dni = "0000001R";
        p2.ColorPelo="black";
        p2.Genero= 'H';
        p2.EstadoCivil= 'S';
        p2.Peso = 70;

        System.out.println(p2.Nombre);
    }
}
