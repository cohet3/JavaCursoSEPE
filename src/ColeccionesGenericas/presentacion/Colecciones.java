package ColeccionesGenericas.presentacion;

import java.util.HashSet;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(9);
        numeros.add(8);
        numeros.add(7);
        numeros.add(2);
        System.out.println(numeros);
        System.out.println("esta vacia"+ numeros.isEmpty());
        System.out.println("existe un 8" + numeros.contains(8));
        System.out.println("Eliminamos el 2" + numeros.remove(2));
        System.out.println("conjunto" + numeros);
        for (Integer elemento:numeros){
            System.out.println(elemento.toString());

        }
    }
}
