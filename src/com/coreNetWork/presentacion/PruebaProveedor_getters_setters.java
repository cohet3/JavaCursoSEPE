package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Proveedor_getters_setters;

public class PruebaProveedor_getters_setters {
    public static void main(String[] args) {
        Proveedor_getters_setters p1= new Proveedor_getters_setters();
        p1.setIdProveedor(11);
        p1.setNombre("Mahuo");
        p1.setTelefono("66666666");
        p1.setNumeroEmpleados(300);

        System.out.println("NUmero PRoveedor = "+p1.getIdProveedor());
        System.out.println("Nombre "+p1.getNombre());
        System.out.println("telefono "+p1.getTelefono());
        System.out.println("número Empleados ="+p1.getNumeroEmpleados());
    }

}
