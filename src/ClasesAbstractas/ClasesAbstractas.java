package ClasesAbstractas;

import ClasesAbstractas.com.coreNetWorkModelo.Gerente;

public class ClasesAbstractas {
    public static void main(String[] args) {
        Gerente g1= new Gerente("pepito", 1200, 0.3);
        System.out.println("sueldo gerente ->"+ g1.calcularNomina());

    }
}
