package com.coreNetWork.modelos;

public class Area {
    // Ejercicio3 Crear la clase area con metodos para calcular el area de un circulo y de un rectangulo

    //methodos
    public double areaRectangulo(double base ,double altura){

        return (base*altura);
    }
    public double areaCirculo( double radio){
        return (radio*radio)*Math.PI;
//        return Math.PI * Math.pow(radio,2);
    }
}
