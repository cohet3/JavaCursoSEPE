package javaIO.presentacion.corenetworks.presentacion;

import com.corenetworks.modelo.Calculadora;

public class ProbarCalculadora {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
//no  hay q abusar de los metodos estaticos porque se quedan siempre en circulacion por el contrario si estan en nulo se los lleva el recolector de basura
        System.out.println("suma ->" +c1.suma(22,33));
        System.out.println("resta ->" +c1.resta(33,22));
        System.out.println("multiplicacion ->" +c1.multiplicacion(2,3));
        System.out.println("division ->" +c1.division(9,3));
    }
}
