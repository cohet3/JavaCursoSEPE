import java.util.Scanner;

public class Ejercicio8if {
    public static void main(String[] args) {

        //8. Pedir un numero entre 0 y 9.999 y decir cuantas cifras tiene
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("introduce un numero entre 0 y 9999");
        int num1 = 0;
        num1 = tecladoEntrada.nextInt();




        if (num1 >= 0 && num1 <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (num1 >= 10 && num1 <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (num1 >= 100 && num1 <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else if (num1 >= 1000 && num1 <= 9999) {
            System.out.println("El número tiene 4 cifras.");
        } else {
            System.out.println("El número no está dentro del rango especificado.");
        }
        tecladoEntrada.close();
    }
}
