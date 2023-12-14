package nauticoBBDD.persistencia;

import nauticoBBDD.modelo.socio;

import java.sql.SQLException;
import java.sql.Statement;

public class accesoSocios extends Conexion {
    public boolean alta(socio s) throws SQLException, ClassNotFoundException {
        //1. declarar variables
        Statement sentencia;
        int resultado = 0;
        String sql = "INSERT INTO socios(carnet , dni) values('"+s.getCarnet()+"','"+s.getDni()+"');";
        //2 abrir la conexion
        abrirConexion();
        //3 crear el statement
        sentencia = miConexion.createStatement();
        //4. actualizar
        resultado = sentencia.executeUpdate(sql);
        //5. devolver el resultado
        return resultado>0;
    }
}
