package com.corenetworks.presentacion;

import com.corenetworks.modelo.CalculadoraMonetaria;

public class ProbarCalculadoraMonetaria {
    public static void main(String[] args) {
        CalculadoraMonetaria c1 = new CalculadoraMonetaria();
        System.out.println("Euro a dolar -> "+c1.convertidorDivisa(22.2));
    }
}
