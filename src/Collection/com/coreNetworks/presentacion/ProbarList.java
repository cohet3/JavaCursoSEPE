package Collection.com.coreNetworks.presentacion;

import Collection.com.coreNetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {
    public static void main(String[] args) {
        List lista= new ArrayList();
        System.out.println("NUmero de elementosd ->"+lista.size());
        System.out.println("Esta vacía la lista -> "+ lista.isEmpty());
        lista.add("casa");
        lista.add("casa");
        System.out.println(lista);
        System.out.println("Contiene casa=? "+ lista.contains("casa"));
        lista.add(7);
        System.out.println("trae la posición 0 -> "+lista.get(0));
        lista.set(0, "piso");
        System.out.println(lista);
        lista.set(0, "adosado");
        System.out.println(lista);
        System.out.println("posisicon del elemento numerico 7->"+lista.indexOf(7));
    lista.remove("adosado");
        System.out.println(lista);
        Empleado e1= new Empleado(2);
        lista.add(e1);
        System.out.println(lista);
        System.out.println("Recorrido lista con un bucle ");
        for (Object elemento: lista){
            System.out.println(elemento.toString());
        }
        for (int i =0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
