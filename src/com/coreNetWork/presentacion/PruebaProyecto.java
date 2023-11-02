package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Proyecto;

import java.util.Scanner;

public class PruebaProyecto {
    public static void main(String[] args) {
        Proyecto p1= new Proyecto(1, "insta",
                1000, 50);
        System.out.println("importe sin descuento ->"+ p1.calcularImporte());
        System.out.println("descuento del 30% ->"+ p1.calcularDescuento(0.3));
        System.out.println(p1.toString());
        //definir Scanerr
        Scanner sc = new Scanner(System.in);
        double descuentoPresentacion;
        System.out.println("Escruba el descuento a aplicar 0 y 1");

        descuentoPresentacion= sc.nextDouble();

        System.out.println("Importe con descuento  -> " + p1.calcularDescuento(descuentoPresentacion));
               
                }
    }

