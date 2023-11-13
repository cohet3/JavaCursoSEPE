package InterfaceComoAtributo.Presentacion;

import InterfaceComoAtributo.Modelo.*;

public class ProbarTaller {
    public static void main(String[] args) {
        Coche c1 = new Coche("9032DDR", "twingo");
        ITaller tMecanico=  new TallerMecanico();
        SeguroCoche s1= new SeguroCoche(tMecanico, "Mapfre");
        System.out.println(s1.reparar(c1));
        ITaller tPintura = new TallerPintura();
        s1.setTaller(tPintura);
        System.out.println(s1.reparar(c1));

    }
}
