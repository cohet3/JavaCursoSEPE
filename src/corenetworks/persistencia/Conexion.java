package corenetworks.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //1.atributos
    protected Connection miConexion;
    //2.metodos
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/northwind",
                "postgres", "Deivid2020");
        System.out.println("Exito al establecer la conexión");
    }

    //3.constructores

    public Conexion() {
    }

    //4.Setters y getters
}
