package InterfaceComoAtributo.Presentacion;

import InterfaceComoAtributo.Modelo.*;

public class ProbarClienteDao {
    public static void main(String[] args) {
        Cliente c2= new Cliente("PEPITO", "000000");
        IDAO procuccion= new AccesoDesarrollo();
        IDAO desarrollo= new AccesoProduccion();
        ClienteDao d1= new ClienteDao();
        d1.setConexion(procuccion);
        d1.setConexion(desarrollo);
        System.out.println(d1.insertar(c2));
        System.out.println(d1.insertar(c2));
    }
}
