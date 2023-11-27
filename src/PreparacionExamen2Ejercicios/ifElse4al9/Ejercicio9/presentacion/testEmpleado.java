package PreparacionExamen2Ejercicios.ifElse4al9.Ejercicio9.presentacion;

import PreparacionExamen2Ejercicios.ifElse4al9.Ejercicio9.modelo.Empleado4;

public class testEmpleado {
    public static void main(String[] args) {
        Empleado4 e1= new Empleado4(3000, true, true );

        System.out.println("aumento de "+e1.calcularAumento());
        System.out.println(e1.toString());
    }


}
