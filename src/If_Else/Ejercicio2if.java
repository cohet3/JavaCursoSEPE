package If_Else;

import java.util.Scanner;

public class Ejercicio2if {
    public static void main(String[] args) {
        //2.Pedir un numero e indicar si es positivo o negativo
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;

        num1 = tecladoEntrada.nextInt();

        if (num1 >=0){
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es negativo");
        }
        tecladoEntrada.close();
    }
}
