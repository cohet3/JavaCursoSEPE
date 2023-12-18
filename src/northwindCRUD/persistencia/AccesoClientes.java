package northwindCRUD.persistencia;



import northwindCRUD.modelo.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoClientes extends Conexion {

    public List<Cliente> obtenerTodos() throws SQLException, ClassNotFoundException {

        //1.Declarar variables
        Statement sentencia;
        List<Cliente> clientes = new ArrayList<>();
        ResultSet rejilla;
        String sql = "Select customer_id, company_name, contact_name from customers";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.createStatement();
        //4. Consultar
        rejilla = sentencia.executeQuery(sql);
        //5. recoger los valores
        while (rejilla.next()) {
            clientes.add( new Cliente(rejilla.getString("customer_id")
                    , rejilla.getString("company_name")
                    , rejilla.getString("contact_name")));
        }

        //5. Devolver el resultado
        return clientes;

    }

    public boolean insertar(Cliente c) throws SQLException, ClassNotFoundException {

        //1.Declarar variables
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "insert into customers (customer_id,company_name,contact_name) values (?,?,?);";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1,c.getIdCliente());
        sentencia.setString(2, c.getNombreEmpresa());
        sentencia.setString(3,c.getNombreContacto());
        //4. Consultar
        resultado = sentencia.executeUpdate();

        return resultado>1;

    }

    public boolean modificar(Cliente c) throws SQLException, ClassNotFoundException {

        //1.Declarar variables
        PreparedStatement sentencia;
        int resultado = 0;
        ResultSet rejilla;
        String sql = "update customers set company_name = ? where customer_id=?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, c.getNombreEmpresa());
        sentencia.setString(2,c.getIdCliente());

        //4. Consultar
        resultado = sentencia.executeUpdate();

        return resultado>1;

    }

    public Cliente obtenerUno(String id) throws SQLException, ClassNotFoundException {

        //1.Declarar variables
        PreparedStatement sentencia;
        Cliente resultado = null;
        ResultSet rejilla;
        String sql = "Select customer_id, company_name, contact_name from customers where customer_id = ?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, id);
        //4. Consultar
        rejilla = sentencia.executeQuery();
        //5. recoger los valores
        if (rejilla.next()) {
            resultado = new Cliente(rejilla.getString("customer_id")
                    , rejilla.getString("company_name")
                    , rejilla.getString("contact_name"));
        }

        //5. Devolver el resultado
        return resultado;

    }


}