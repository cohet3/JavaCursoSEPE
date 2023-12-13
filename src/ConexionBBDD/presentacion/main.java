package ConexionBBDD.presentacion;

import ConexionBBDD.persistencia.AccesoProducto;
import ConexionBBDD.persistencia.Conexion;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        Conexion c1= new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        AccesoProducto ap1= new AccesoProducto();
/*        try {
            System.out.println(ap1.obtenerTodos());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }catch (SQLException e) {
        System.out.println(e.toString());
    }*/

        try {
            System.out.println(ap1.obtenerTodos());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

    }
}
