package Map.com.corenetWorks.presentacion;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // Polimorfismo
        java.util.Map tabla= new HashMap();
        tabla.put("12225544S", "Juan Lopez");
        System.out.println(tabla);
        tabla.put("5544545G", "Laura Flores");
        tabla.put(2,8);
        System.out.println(tabla);
        System.out.println("Obtener el nombre del dni 12225544S->"+ tabla.get("12225544S"));
        System.out.println("Obtener el nombre del dni 5544545G->"+ tabla.get("5544545G"));
        System.out.println("los valores de tabla son_>"+tabla.values());
        System.out.println("los valores de las keys->"+tabla.keySet());
        System.out.println("los valores de ambos ->"+tabla.entrySet());
    }
}
