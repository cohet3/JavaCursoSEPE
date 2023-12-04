package dataBase1.presentacion;

import dataBase1.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class PruebaProducto{
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("boligrafo",1.2));
        productos.add(new Producto("libreta" , 3));

        IImpuesto general = new IvaGeneral();
        IImpuesto reducido = new IvaSuperReducido();

        Factura f1 = new Factura();
        f1.setImpuesto(general);
        f1.setProductos(productos);
        System.out.println("IVA general " + f1.calcularTotalFactura());
        f1.setImpuesto(reducido);
        System.out.println("IVA reducido " + f1.calcularTotalFactura());

    }
}
