package Comparator.presentacion;

import Comparator.modelo.ClienteSimple;
import Comparator.modelo.ComparadorNif;
import Comparator.modelo.ComparadorNombre;

import java.util.ArrayList;
import java.util.TreeSet;

public class PruebaClienteSimple {
    public static void main(String[] args) {
        // crear una coleccion que clasifique los objetos __>TreeSet
        ComparadorNombre c = new ComparadorNombre();
        ComparadorNif nif= new ComparadorNif();
        //Elegimos ordenar los clientes por su nombre
        TreeSet arbol= new TreeSet(c);
        //TreeSet arbol = new TreeSet(nif);
        arbol.add(new ClienteSimple("Juan", 1500, "1111-A"));
        arbol.add(new ClienteSimple("Jose", 2500, "3333-B"));
        arbol.add(new ClienteSimple("Maria", 1800, "222-C"));
        arbol.add(new ClienteSimple("Laura", 1500, "0000-D"));
        Object[] array = arbol.toArray();
        for (int i=0; i<array.length; i++ ){
            System.out.println((ClienteSimple)array[i]);
        }
  /*      ArrayList list= new ArrayList();
        list.add(0, new Integer(42));
        int total= ((Integer)list.get(0)).intValue();

        ArrayList list2= new ArrayList();
        list.add(0, new Integer(12));
        int total2= ((Integer) list.get(0)).intValue();*/
    }
}
