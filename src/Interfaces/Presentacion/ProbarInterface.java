package Interfaces.Presentacion;

import Interfaces.Modelo.*;

public class ProbarInterface {
    public static void main(String[] args) {
        //instanciar un avión con nombre de objeto ax2
        Avion ax2 = new Avion("guacamayo");
        //Polimorfismo
        iObjetoVolador ax3 = new Avion("rojo");

        iObjetoVolador ave1= new Ave();

        iObjetoVolador clarcKen = new SuperMan();

        iObjetoVolador ha1 = new HidroAvion();

        iObjetoVolador []voladores={ax2, ax3, ave1, clarcKen, ha1};

        for (iObjetoVolador elemento: voladores){
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar());
            System.out.println(elemento.toString());
            if (elemento instanceof Ave){
                System.out.println(((Ave) elemento).hacerNido());
                System.out.println(((Ave) elemento).ponerHuevo());
            }
            if (elemento instanceof SuperMan){
                System.out.println(((SuperMan) elemento).saltarEdificio());
                System.out.println(((SuperMan) elemento).pararBala());
            }
            if (elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).atracar());
                System.out.println(((HidroAvion) elemento).navegar());
            }

        }
        Barcaza b1 = new Barcaza();
        iNautico[] nauticos = {b1, ( iNautico) ha1};
        for (iNautico elemento: nauticos){
            System.out.println(elemento.navegar());
            System.out.println(elemento.atracar());
            if (elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).despegar());
                System.out.println(((HidroAvion) elemento).aterrizar());
                System.out.println(((HidroAvion) elemento).volar());
            }
        }
    }
}
