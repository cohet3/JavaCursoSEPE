package nauticoBBDD.presentacion;

import dataBase1.modelo.Producto;
import nauticoBBDD.modelo.Empleado;


import java.sql.SQLException;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(103, "Juanito", "Alimaña", 2);
//        AccesoEmpleados aE = new AccesoEmpleados();
/*        try {
            System.out.println(aE.modificarSocio(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(aE.eliminar(100));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }*/
/*        try {
            System.out.println("El empleado se ha dado de alta  "+ aE.alta(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }*/
        Producto p1 = new Producto("tomates", 2);

    }
}
