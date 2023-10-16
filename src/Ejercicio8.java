import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        //8. Pedir un numero entre 0 y 9.999 y decir cuantas cifras tiene
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("introduce un numero entre 0 y 9999");
        int num1 = 0;
        num1 = tecladoEntrada.nextInt();
        int longitud=num1.length();



        if (num1 > 0 && num1 < 9999 ){

            System.out.println("la longitud del numero es  "+longitud);
        }else {
            System.out.println("introduce un numero entre 0 y 9999");
        }

    }
}
