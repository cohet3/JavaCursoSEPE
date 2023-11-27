package Comparator.modelo;

import java.util.Comparator;

public class ComparadorNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (((ClienteSimple)o1).nombre.compareTo(((ClienteSimple)o2).nombre));
    }
}
