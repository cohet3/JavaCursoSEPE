package TryCatch.com.coreNetworks.presentacion;

import TryCatch.com.coreNetworks.modelo.Fecha;

public class ProbarFecha {
    public static void main(String[] args) {
        Fecha f1= new Fecha();
        try {
            f1.setMes(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            f1.setDia(33);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
