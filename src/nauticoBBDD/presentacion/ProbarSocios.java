package nauticoBBDD.presentacion;

import nauticoBBDD.modelo.socio;
import nauticoBBDD.persistencia.accesoSocios;

import java.sql.SQLException;



public class ProbarSocios {
    public static void main(String[] args) {
        accesoSocios as= new accesoSocios();
        socio s = new socio("1234567A", "123456");
        try {
            System.out.println("Se ha insertado el socio ? " + as.alta(s));
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
