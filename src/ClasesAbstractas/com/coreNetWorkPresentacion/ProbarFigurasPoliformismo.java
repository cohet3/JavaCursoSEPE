package ClasesAbstractas.com.coreNetWorkPresentacion;

import ClasesAbstractas.com.coreNetWorkModelo.Cuadrado;
import ClasesAbstractas.com.coreNetWorkModelo.Figura;
import ClasesAbstractas.com.coreNetWorkModelo.Triangulo;

public class ProbarFigurasPoliformismo {
    public static void main(String[] args) {
        //cuadrados
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(2);
        Figura cMediano = new Cuadrado(2,2,2);

        //triangulo
        Triangulo tPeque= new Triangulo();
        tPeque.setAltura(3);
        tPeque.setBase(1);
        Figura tMediano = new Triangulo(2,4,5,7);
        //rellenar array con figuras creadas
        Figura[] figuras= {cPeque,cMediano,tPeque,tMediano};

        //mostrar el array creado
        for (Figura elemeto: figuras){
            if (elemeto instanceof Cuadrado ){
                System.out.println("lado cuadrado instance of"+((Cuadrado) elemeto).getLado());
            }
            if (elemeto instanceof Triangulo){
                System.out.println("triangulo base y altura instanceOf"+((((Triangulo) elemeto).getAltura())));
            }
            System.out.println(elemeto.toString());
            System.out.println("calcular area "+elemeto.calcularArea());

        }



    }
}
