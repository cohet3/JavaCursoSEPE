package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Especialidad;

public class PruebaEspecialidad {
    public static void main(String[] args) {
        Especialidad e1= new Especialidad("pepito",1);
        Especialidad e2= new Especialidad("juanito",2);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
