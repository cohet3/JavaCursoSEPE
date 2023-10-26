package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Producto_getters_setters;

public class PruebaProducto_getters_setters {
    public static void main(String[] args) {
        Producto_getters_setters p1 =new Producto_getters_setters();
        p1.setIdProducto(5);//p1.idProducto= 5
        p1.setNombre("Ratón gris");
        p1.setCantidadExistencia(100);

        System.out.println("Id: "+p1.getIdProducto());
        System.out.println("Nombre:" + p1.getNombre());
        System.out.println("Cantidad en existencia =" + p1.getCantidadExistencia());
    }
}
