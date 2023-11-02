package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado e1= new Empleado(1,1000,
                "6002200R", 500, 0.2 );
        System.out.println(e1.toString());
        e1.calcularSueldo();
        System.out.println(e1.toString());
        e1.calcularImpuesto();

        System.out.println(e1.toString());
    }
}
