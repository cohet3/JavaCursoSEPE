package RepasoNoviembre23.presentacion;

import RepasoNoviembre23.modelo.Empleado;

import java.util.TreeSet;

public class PruebaEmpleado {
    public static void main(String[] args) {
        TreeSet<Empleado> EmpleadosOrdenados= new TreeSet<>();
        EmpleadosOrdenados.add(new Empleado(1,3000.2,"Danny"));
        EmpleadosOrdenados.add(new Empleado(2,2000.2,"Pepito"));
        EmpleadosOrdenados.add(new Empleado(3,1800.2,"Fulaninto"));
        System.out.println(EmpleadosOrdenados);
    }
}
