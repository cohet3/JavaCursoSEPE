package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Cuenta;

import java.util.Scanner;

public class PruebaCuenta {
/*    https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
            1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

            2.El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

    3.Crea sus métodos get, set y toString.

            4.Tendrá dos métodos especiales:
    ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
            retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
    la cantidad de la cuentano hace nada*/
public static void main(String[] args) {
    //1. declaramos variables
    Cuenta c1= new Cuenta("danny", 1000);
    Scanner sc= new Scanner(System.in);
    // 2.
    c1.ingresar(23.3);
    c1.retirar(30.24);
    System.out.println(c1.toString());

}
}
