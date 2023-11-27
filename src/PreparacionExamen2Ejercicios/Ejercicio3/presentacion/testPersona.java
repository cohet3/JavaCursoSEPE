package PreparacionExamen2Ejercicios.Ejercicio3.presentacion;

import PreparacionExamen2Ejercicios.Ejercicio3.modelo.Persona;

public class testPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(5);
        Persona p2 = new Persona(15);
        Persona p3 = new Persona(33);
        p1.calcularEdadEnDias();
        p1.calcularEdadEnSegundos();
        p2.calcularEdadEnDias();
        p2.calcularEdadEnSegundos();
        p3.calcularEdadEnDias();
        p3.calcularEdadEnSegundos();
        System.out.println( "edad en dias->"+p1.calcularEdadEnDias()+
        " Edad en segundos-> "+p1.calcularEdadEnSegundos());
        System.out.println( "edad en dias-> "+p2.calcularEdadEnDias()+
                " Edad en segundos->"+p2.calcularEdadEnSegundos());
        System.out.println( "edad en dias-> "+p3.calcularEdadEnDias()+
                " Edad en segundos->"+p3.calcularEdadEnSegundos());



    }
}
