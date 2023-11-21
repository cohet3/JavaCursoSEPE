package ColeccionesGenericas.presentacion;

import ColeccionesGenericas.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarListGenerico {
    public static void main(String[] args) {
        List<Empleado> empleados =new ArrayList<>();
        empleados.add(new Empleado(2));
        empleados.add(new Empleado(3));
        empleados.add(new Empleado(4));
        Empleado e1 = new Empleado(1);
        empleados.add(e1);
        empleados.add(e1);
        System.out.println("Cuantos elementos tiene la lista ->"+ empleados.size());
        System.out.println("Array List " +empleados);
        System.out.println("Existe el empleado 1 en la lista ->" +empleados.contains(e1));
        System.out.println("El empleado de la posicion 3->"+empleados.get(3));
        System.out.println("en que posición esta el empleado 1 ->"+empleados.indexOf(e1));
        System.out.println("eliminar el e1->"+empleados.remove(e1));
        System.out.println("lista->"+empleados);
    }
}
