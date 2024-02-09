package BancoBD_crud.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //1 Atributos
    protected Connection miConexion;
    //2 Metodos
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/corebank",
                "postgres", "123456");
        System.out.println("Exito en la primera conexión");

    }
    //3 Constructores

    public Conexion() {
    }



}

