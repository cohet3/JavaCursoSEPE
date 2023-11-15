package Enumeraciones.presentacion;

import Enumeraciones.modelo.EstadoCivil;
import Enumeraciones.modelo.EstadoCivilAvanzado;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ProbarEstadoCivil {
    public static void main(String[] args) {
        EstadoCivil pepito = EstadoCivil.SOLTERO;
        System.out.println(pepito);
        EstadoCivil laura = EstadoCivil.valueOf("OTRO");
        System.out.println(laura);
        System.out.println("Las constantes de EstadoCivil: ");
        for (EstadoCivil elemento: EstadoCivil.values()){
            System.out.println(elemento);
        }
        System.out.println("Enumeraciones Avanzadas");
        EstadoCivilAvanzado luis = EstadoCivilAvanzado.CASADO;
        System.out.println(luis);
        System.out.println("Recorrer estado civil avanzado");
        for (EstadoCivilAvanzado elemento: EstadoCivilAvanzado.values()){
            System.out.println(elemento);
            System.out.println(elemento.getDescripcion());
            System.out.println(elemento.name());
            System.out.println(elemento.toString());
            System.out.println(elemento.ordinal());
        }
    }
}
