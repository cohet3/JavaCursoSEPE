package ClasesAbstractas.com.coreNetWorkPresentacion;

import ClasesAbstractas.com.coreNetWorkModelo.Circulo;

import ClasesAbstractas.com.coreNetWorkModelo.Rectangulo;

public class FiguraPrueba {
    public static void main(String[] args) {
  /*      Figura f1= new Figura() {
            @Override
            public double calcularArea() {
                return 0;
            }
        }  no se puede instanciar porque la clase Figura porq es abstracta*/
        Rectangulo r1= new Rectangulo(0,0,4,2);
        System.out.println("area rectangulo"+r1.calcularArea());
        Circulo c1= new Circulo(4,4,2);
        System.out.println("Area del circulo " +c1.calcularArea());
        System.out.println(c1.toString());
    }
}
