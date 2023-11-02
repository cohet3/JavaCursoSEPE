package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Ordenador;

public class PruebaOrdenador {
    public static void main(String[] args) {
        Ordenador o1= new Ordenador("21221","45465fg", true);
        System.out.println(o1.toString());
        //definir un array de ordenadores
        Ordenador[]nombresOrdenadores=new Ordenador[4];
        for(int i=0; i< nombresOrdenadores.length; i++){
            nombresOrdenadores[i]= new Ordenador("2121","2545f", true);
        }
        for (Ordenador lemento: nombresOrdenadores){
            System.out.println(lemento);
        }

    }
}
