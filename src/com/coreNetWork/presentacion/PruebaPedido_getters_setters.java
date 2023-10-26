package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Pedido_getters_setters;

import java.util.Scanner;

public class PruebaPedido_getters_setters {
    public static void main(String[] args) {
        //1.Declaramos variables
        Pedido_getters_setters p1 = new Pedido_getters_setters();
        Scanner sc= new Scanner(System.in);
        //Solicitar datos
        System.out.println("Escriba el id del pedido -> ");
        p1.setIdPedido(sc.nextInt());
        System.out.println("Escriba el importe -> ");
        p1.setImporte(sc.nextDouble());
        System.out.println("Escriba la forma de pago ->");
        p1.setFormaPago(sc.next().charAt(0));

        System.out.println(p1.mostrarInfo());

        System.out.println( "el IVa es = "+ p1.calcularIva(0.4));
    }
}
