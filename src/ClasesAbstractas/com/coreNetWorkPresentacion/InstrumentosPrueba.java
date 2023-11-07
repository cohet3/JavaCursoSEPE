package ClasesAbstractas.com.coreNetWorkPresentacion;

import ClasesAbstractas.com.coreNetWorkModelo.Bateria;
import ClasesAbstractas.com.coreNetWorkModelo.Flauta;
import ClasesAbstractas.com.coreNetWorkModelo.Guitarra;

public class InstrumentosPrueba {
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("cuerdas");
        System.out.println("sonido guitarra " + g1.emitirSonido());
        System.out.println(g1.toString());

        Bateria b1= new Bateria(5);
        System.out.println("sonido bateria " + b1.emitirSonido());
        System.out.println(b1.toString());

        Flauta f1 = new Flauta("apple", "pastico");
        System.out.println("sonido flauta "+f1.emitirSonido());
        System.out.println(f1.toString());
    }
}
