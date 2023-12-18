package northwindCRUD.presentacion;


import northwindCRUD.modelo.Cliente;
import northwindCRUD.persistencia.AccesoClientes;

import java.sql.SQLException;

public class ProbarAccesoCliente {
    public static void main(String[] args) {
        AccesoClientes aC1 = new AccesoClientes();
        try {
            System.out.println(aC1.obtenerUno("ALFKI"));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(aC1.obtenerTodos());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        Cliente c1 = new Cliente("COREN","CoreNetworks2","Silvia2");
        try {
            System.out.println(aC1.modificar(c1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}