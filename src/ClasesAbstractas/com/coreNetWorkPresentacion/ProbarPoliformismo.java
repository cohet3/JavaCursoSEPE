package ClasesAbstractas.com.coreNetWorkPresentacion;

import ClasesAbstractas.com.coreNetWorkModelo.*;

public class ProbarPoliformismo {
    public static void main(String[] args) {
        //probar poliformismo
//        Gerente g1= new Gerente("pepe", 2000.5,500);
        Empleado e1= new Gerente("paquito", 3000, 700);
        System.out.println("Calcular nómina -> "+e1.calcularNomina());
        System.out.println(e1.toString());
        Gerente g2=(Gerente)e1;
        System.out.println("Bono -> "+g2.getBono());

        Empleado e2= new Vendedor("luis",1500,2000,0.01);
        System.out.println("calcular nomina -> "+e2.calcularNomina());
        System.out.println(e2.toString());

        Empleado e3 = new Operador("paco", 1600, 1000, 0.2);
        System.out.println("Calcular nomina -> " + e3.calcularNomina());
        System.out.println(e3.toString());

        Empleado[] empleados= new Empleado[3];
        empleados[0]= e1;
        empleados[1]= e2;
        empleados[2]= e3;
        for (Empleado elemento: empleados){
            if(elemento instanceof Gerente){
                System.out.println( "Bono ->" +((Gerente) elemento).getBono());
            }
            if(elemento instanceof Vendedor){
                System.out.println( "Ventas ->" +((Vendedor) elemento).getVentas());
            }
            if(elemento instanceof Operador){
                System.out.println( "Piezas ->" +((Operador) elemento).getPiezas());
            }


            System.out.println("Calcular nomina -> " +elemento.calcularNomina());
            System.out.println(elemento.toString());

        }

    }

    public static void main2(String[] args) {
        IntrumentoMusical guido= new Guitarra("cuerdas", "cuerdas2");
        IntrumentoMusical bataca= new Bateria("yamaha", 4);
        IntrumentoMusical ham= new Flauta("flaute", "hierro");
        IntrumentoMusical[] instrumentos = {guido, bataca, ham};

        for (IntrumentoMusical elemento : instrumentos) {

            System.out.println("Emitir sonido -> " + elemento.emitirSonido());
            System.out.println(elemento.toString());
        }
    }
}
