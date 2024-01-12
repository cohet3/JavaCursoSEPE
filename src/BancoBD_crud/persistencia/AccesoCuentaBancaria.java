package BancoBD_crud.persistencia;


import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoCuentaBancaria extends Conexion{
    public Double consultarSaldo(String numeroTarjeta) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia = null;
        String sql = "select saldo from cuenta_bancaria where no_tarjeta = ?";
        double resultado= 0;
        ResultSet rejilla = null;
        //2.abrir conexion
        abrirConexion();
        //3. Crear el statetemt
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, numeroTarjeta);
        //4. ejecutarlo
        rejilla = sentencia.executeQuery();
        //5. obtener el resultado
        if (rejilla.next()){
            System.out.println(rejilla.getString("saldo"));
            resultado = Double.parseDouble(rejilla.getString("saldo").toString().replace("€","").replace(".","").replace(",","."));
        }
        //6. devolver

        return resultado;
    }
    public String consultarPin(String numeroTarjeta) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia = null;
        String sql = "select pin from cuenta_bancaria where no_tarjeta = ?";
        String resultado = null;
        ResultSet rejilla = null;
        //2.abrir conexion
        abrirConexion();
        //3. Crear el statetemt
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, numeroTarjeta);
        //4. ejecutarlo
        rejilla = sentencia.executeQuery();
        //5. obtener el resultado
        if (rejilla.next()){
            resultado= (rejilla.getString("pin"));

        }
        //6. devolver

        return resultado;
    }
    public void actualizarSaldo(String numeroTarjeta, double cantidad) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia = null;
        String sql = "update cuenta_bancaria set saldo = saldo+ cast(? as money) where no_tarjeta = ?";

        //2.abrir conexion
        abrirConexion();
        //3. Crear el statetemt
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setBigDecimal(1, new BigDecimal(cantidad));
        sentencia.setString(2, numeroTarjeta);
        //4. ejecutarlo
        sentencia.executeUpdate();
        //5. obtener el resultado
        //6. devolver
    }
}
