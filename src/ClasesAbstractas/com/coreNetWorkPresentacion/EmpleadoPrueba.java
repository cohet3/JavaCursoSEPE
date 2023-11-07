package ClasesAbstractas.com.coreNetWorkPresentacion;

import ClasesAbstractas.com.coreNetWorkModelo.Gerente;
import ClasesAbstractas.com.coreNetWorkModelo.Operador;
import ClasesAbstractas.com.coreNetWorkModelo.Vendedor;

public class EmpleadoPrueba {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("pepito",1200,0.3);
        System.out.println("sueldo gerente " +g1.calcularNomina());
        System.out.println(g1.toString());

        Vendedor v1= new Vendedor("paquito",1200,200,0.3);
        System.out.println("sueldo vendedor "+v1.calcularNomina());
        System.out.println(v1.toString());

        Operador o1= new Operador("luis", 2000, 32, 0.5);
        System.out.println("sueldo operario "+o1.calcularNomina());
        System.out.println(o1.toString());
    }



}
