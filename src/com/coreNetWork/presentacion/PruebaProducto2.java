package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Producto2;

public class PruebaProducto2 {
    public static void main(String[] args) {
        Producto2 p1= new Producto2(1,"iphone", 5);
    p1.compraProducto(2);
    p1.ventaProducto(5);
        System.out.println(p1.toString());
    }
}
