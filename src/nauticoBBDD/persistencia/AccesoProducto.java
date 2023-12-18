package nauticoBBDD.persistencia;

import ConexionBBDD.modelo.Producto;
import nauticoBBDD.modelo.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoProducto {
    public Cliente obtenerUno(int id) throws ClassNotFoundException, SQLException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select product_id, product_name,unit_price,units_in_stock from products where product_id = " + id;
        Cliente c1 = null;
///*        abrirConexion();
//        sentencia = miConexion.createStatement();
//        resultado = sentencia.executeQuery(sql);
//
//        if(resultado.next()){
//            c1 = new Producto(resultado.getInt("product_id"),
//                    resultado.getString("product_name"),
//                    resultado.getDouble("unit_price") ,
//                    resultado.getInt("units_in_stock") );
//        }
//        return c1;
//    }*/


        return c1;
    }
}