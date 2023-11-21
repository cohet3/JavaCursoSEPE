package ColeccionesGenericas.presentacion;

import ColeccionesGenericas.modelo.Avion;
import ColeccionesGenericas.modelo.Pasajero;
import ColeccionesGenericas.modelo.Ubicacion;

import java.util.Scanner;

public class ProbarVuelo {
    public static void main(String[] args) {
    //1. declarar un scanner
        Scanner sc= new Scanner(System.in);
        Pasajero p1= new Pasajero();
        Avion a1= new Avion();
        int resultado =0;
        // 2. Pedir nombre, dni , clase
        System.out.println("introduce un DNI:");
        p1.setDni(sc.nextLine());
        System.out.println("introduce un nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.println("introduce la clase preferente \n 1) Ejecutivo \n 2)turista \n");
        int clase = sc.nextInt();
        if (clase==1){
            System.out.println("Escoja la ubicacion \n 1)Ventana \n 2) Pasillo\n");
            int ubicacion =sc.nextInt();
            if (ubicacion==1){
                resultado=a1.asignarAsientoEjecutivo(p1, Ubicacion.VENTANA);
            }else {
                resultado=a1.asignarAsientoTurista(p1, Ubicacion.PASILLO);
            }
        }else {
            System.out.println("Escoja la ubicacion \n 1)Ventana \n 2) Centro\n 3) Pasillo\n");
            int ubicacion =sc.nextInt();
            switch (ubicacion){
                case 1: resultado=a1.asignarAsientoTurista(p1, Ubicacion.VENTANA);
                break;
                case 2: resultado=a1.asignarAsientoTurista(p1, Ubicacion.CENTRO);
                break;
                case 3: resultado=a1.asignarAsientoTurista(p1, Ubicacion.PASILLO);
                break;
            }
        }
        System.out.println("el asiento que le asignamos es el ->"+resultado);
        //3. un pasajero instanciar

        //4. si es ejecutiva llamamos al metodo correspondiente

        //5 devolvemos el asiento q le corresponde

    }
}
