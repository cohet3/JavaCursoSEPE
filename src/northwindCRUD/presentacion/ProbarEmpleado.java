package northwindCRUD.presentacion;




import northwindCRUD.modelo.Empleado;
import northwindCRUD.persistencia.AccesoEmpleados;

import java.sql.SQLException;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(103,"ANAX","FLORESX",2);
        AccesoEmpleados aE = new AccesoEmpleados();
        try {
            System.out.println(aE.modificarSP(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(aE.eliminar(102));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("El empleado se ha dado de alta " + aE.alta(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }


    }
}