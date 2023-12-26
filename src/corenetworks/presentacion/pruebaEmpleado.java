package corenetworks.presentacion;

import org.corenetworks.modelo.Empleado;
import org.corenetworks.persistencia.AccesoEmpleados;
import org.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class pruebaEmpleado {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        Empleado e1 = new Empleado(104, "fulanito", "Reyes", 3);
        AccesoEmpleados ae= new AccesoEmpleados();
        try {
            System.out.println("El empleado se ha dado de alta "+ ae.alta(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

}
