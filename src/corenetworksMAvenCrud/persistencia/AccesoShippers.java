package corenetworksMAvenCrud.persistencia;



import org.corenetworks.modelo.Shippers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoShippers extends Conexion{
    public boolean alta(Shippers e) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        int resultado= 0;
        String sql = "insert into shippers (shipper_id, company_name, phone) values (?,?,?);";
        //2. Abrir conexion
        abrirConexion();
        //3 Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1,e.getShipperId());
        sentencia.setString(2,e.getCompanyName());
        sentencia.setString(3,e.getPhone());
        //4 actualizar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado >0;

    }
    public boolean modificar(Shippers e) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        Statement sentencia;
        int resultado = 0;
        String sql = "update shippers set phone = '"+e.getPhone() +"' where shipper_id=" + e.getShipperId();
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.createStatement();
        //4. Modificar
        resultado = sentencia.executeUpdate(sql);
        //5. Devolver el resultado
        return resultado > 0;
    }
    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        Statement sentencia;
        int resultado = 0;
        String sql = "Delete from shippers where shipper_id=" + id;
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.createStatement();
        //4. Eliminar
        resultado = sentencia.executeUpdate(sql);
        //5. Devolver el resultado
        return resultado > 0;
    }
    public Shippers obtenerUno(int id) throws SQLException, ClassNotFoundException {

        //1.Declarar variables
        PreparedStatement sentencia;
        Shippers resultado = null;
        ResultSet rejilla;
        String sql = "Select shipper_id, company_name, phone from shippers where shipper_id = ?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1, id);
        //4. Consultar
        rejilla = sentencia.executeQuery();
        //5. recoger los valores
        if (rejilla.next()) {
            resultado = new Shippers(rejilla.getInt("shipper_id")
                    , rejilla.getString("company_name")
                    , rejilla.getString("phone"));
        }

        //5. Devolver el resultado
        return resultado;

    }
}
