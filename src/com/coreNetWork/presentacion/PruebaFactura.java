package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Factura;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        //Solicitar los datos por consola y luego mostrarlos
        //variables
        //instancia
        Scanner sc= new Scanner(System.in);

        Factura f1= new Factura();
        System.out.println("introduce un ID");
        f1.Id=sc.nextInt();
        System.out.println("Introduce tu nombre");
        f1.Cliente= sc.nextLine();
        f1.Cliente= sc.nextLine();
        System.out.println("Introduce tu dirección");
        f1.DirecciónEntrega=sc.nextLine();
        System.out.println("Introduce el importe");
        f1.Importe= sc.nextInt();
        f1.CalcularIVA();

        System.out.println("el id es "+ f1.Id);
        System.out.println("el cliente es "+ f1.Cliente);
        System.out.println("La dirección es "+ f1.DirecciónEntrega);
        System.out.println("Introduce el importe "+ f1.Importe);
        System.out.println(" El iva es -> "+f1.CalcularIVA());
        System.out.println(" El iva es -> "+f1.CalcularIVA(0.04));

    }
}
