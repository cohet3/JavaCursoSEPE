package TryCatch.com.coreNetworks.presentacion;

import TryCatch.com.coreNetworks.modelo.TipoProducto;

public class Ejemplo2TryCatch {
    public static void main(String[] args) {

        try {
            TipoProducto leche= TipoProducto.valueOf("PRODUCTO_PRIMERA_NECESIDAD");

        }catch (IllegalArgumentException e1){
            System.out.println("el producto no esta en la lista");

        }finally {
            System.out.println("Entra el finally");
        }
    }
}
