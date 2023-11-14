package Time_fechas.com.corenetWork.presentacion;

import Time_fechas.com.corenetWork.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3= o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.getClass());
        Producto p1 = new Producto(1,10);
        Producto p2 = new Producto(1,5);
        Producto p3 = p1;
        System.out.println(p1.toString());
        System.out.println( "Equals de p1 y p2 "+p1.equals(p2));
        System.out.println( "Equals de p1 y p3 "+p1.equals(p3));
        System.out.println("hash code -> "+ p1.hashCode());
        System.out.println("hash code -> "+ p2.hashCode());
        System.out.println("hash code -> "+ p3.hashCode());
        System.out.println(p1.getClass());
        //probar metodo iva que lleva final
        System.out.println("iva ->" + p1.iva());
        System.out.println("iva ->" + p2.iva());
    }
}
