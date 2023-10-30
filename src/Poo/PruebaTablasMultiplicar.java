package Poo;

import java.util.Scanner;

public class PruebaTablasMultiplicar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce la tabla a mostrar");

 // constructor vacío
        TablasDeMultiplicar t1= new TablasDeMultiplicar();
        t1.setTabla(sc.nextInt());
        System.out.println(t1.tablaMultiplicar());
        //constructor completo
        TablasDeMultiplicar t2= new TablasDeMultiplicar(5);
        System.out.println(t2.tablaMultiplicar());
    }
}
