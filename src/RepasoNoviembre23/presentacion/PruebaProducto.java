package RepasoNoviembre23.presentacion;

import RepasoNoviembre23.modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PruebaProducto {
    public static void main(String[] args) {
        List<Producto> productos= new ArrayList<>();
        productos.add(new Producto(1, 100, 2.5));
        productos.add(new Producto(2, 2, 400));
        productos.add(new Producto(3, 50, 25));
        System.out.println(productos);

        TreeSet<Producto> productosOrdenados = new TreeSet<>();
        productosOrdenados.add(new Producto(1, 100, 2.5));
        productosOrdenados.add(new Producto(2, 2, 400));
        productosOrdenados.add(new Producto(3, 50, 25));
        System.out.println(productosOrdenados);
    }
}
