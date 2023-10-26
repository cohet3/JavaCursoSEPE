package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Cliente;

import java.util.Scanner;

public class PruebaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el nombre del cliente ->");
        c1.nombre = teclado.nextLine();

        System.out.println("Escriba el numero de empleados ->");
        c1.cantidadEmpleados = teclado.nextInt();

        System.out.println("Escriba la cantidad de deparatamentos ->");
        c1.numeroDepartamentos = teclado.nextInt();

        System.out.println("Escriba la facturación ->");
        c1.facturacion = teclado.nextDouble();

        System.out.println("El impuesto es -> " +c1.calcularImpuestos());
    }
}
