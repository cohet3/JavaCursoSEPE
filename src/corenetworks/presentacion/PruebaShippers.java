package corenetworks.presentacion;

import org.corenetworks.modelo.Shippers;
import org.corenetworks.persistencia.AccesoShippers;

import java.sql.SQLException;

public class PruebaShippers {
    public static void main(String[] args) {

        Shippers s1= new Shippers(13, "aple", "77777777" );
        AccesoShippers aS= new AccesoShippers();
        try {
            System.out.println("el shippers se ha dado de alta "+ aS.alta(s1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

        try {
            System.out.println("el telefono ha sido actualizado " + aS.modificar(s1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println("El shipper ha sido eliminado"+ aS.eliminar(13));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println("Obtener uno"+ aS.obtenerUno(1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println("Mostrar todos -> " +aS.obtenerTodos());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
