package TryCatch.com.coreNetworks.presentacion;

import TryCatch.com.coreNetworks.modelo.Producto;

public class PruebaProducto {
    public static void main(String[] args) throws Exception {
        Producto p1= new Producto(0);
        try {
            p1.comprobarID();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(p1.toString());

    /*    try {
            System.out.println(p1.getId());
        }
        catch ()*/
    }
}
