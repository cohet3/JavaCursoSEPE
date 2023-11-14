package InterfaceComoAtributo.Presentacion;

import InterfaceComoAtributo.Modelo.Coche1;
import InterfaceComoAtributo.Modelo.Conductor;


public class PresentacionVehiculo {
    public static void main(String[] args) {
        Coche1 c1= new Coche1(-1);

        Conductor conduc= new Conductor(c1);
        System.out.println(conduc.conducir());
    }
}
