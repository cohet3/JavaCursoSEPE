import java.util.Scanner;

public class Ejercicio6if {
    public static void main(String[] args) {
        //6. Pedir dos numeros y mostrarlos ordenados de mayor a menor
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        num1 = tecladoEntrada.nextInt();
        num2 = tecladoEntrada.nextInt();
        int numeroMayor = 0;
        if (num1 > num2){
            numeroMayor = num1;
            System.out.println("el num1 es mayor  " + numeroMayor);
        }else{
            numeroMayor= num2;
            System.out.println("el num2 es mayor  " + numeroMayor);
        }
    }
}
