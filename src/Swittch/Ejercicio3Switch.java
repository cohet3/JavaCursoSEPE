package Swittch;

import java.util.Scanner;

public class Ejercicio3Switch {
    public static void main(String[] args) {
        // 3. pedir el dia , mes y año de una fecha e indicar si la fecha es correcta con meses de 28 dias 30 y 31 dias. sin años bisiestos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = sc.nextInt();

        boolean fechaValida = false;
        // 31 dias meses 1,3,5,7,8,10,12
        // 30 dias meses:4,6,9,11
        //28 dias mes: 2
        switch (mes) {
            case 1,3,5,7,8,19,12:
                if (dia >=1 && dia <= 31){
                    fechaValida = true;
                }
                break;
            case 4,6,9,11:
                if (dia >=1 && dia <=30){
                    fechaValida= true;
                }
                break;
            case 2:
                if (dia >=1 && dia <=28){
                    fechaValida= true;
                }
                break;
        }
        if(fechaValida){
            System.out.println("La fecha es valida  " + dia+"-"+mes+"-"+anio);
        }else{
            System.out.println("Lafecha es invalida  " + dia+"-"+mes+"-"+anio);
        }


    }
}
