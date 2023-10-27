package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Area;

public class PruebaArea {
    public static void main(String[] args) {
        Area rectangulo =new Area();
        System.out.println("Area del rectangulo = "+ rectangulo.areaRectangulo(2.2,4.4));
        Area circulo = new Area();
        System.out.println("Area del circulo = "+ circulo.areaCirculo(2.2));

    }

}
