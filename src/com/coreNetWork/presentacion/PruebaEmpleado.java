package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1= new Empleado(1,1200,"000000A","danny",238.45, 0.3);
        System.out.println("Sueldo -> "+  e1.calcularSueldo());
        System.out.println("Impuesto -> "+  e1.calcularImpuesto());
        System.out.println(e1.toString());
    }
}
