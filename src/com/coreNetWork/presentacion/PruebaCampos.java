package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Campos;

public class PruebaCampos {
    public static void main(String[] args) {
        Campos campo= new Campos();
        campo.setX(2);
        System.out.println(campo.incrementa());
        System.out.println(campo.muestra());

    }
}
