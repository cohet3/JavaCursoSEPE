import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //5.Pedir dos números y decir cual es el mayor.
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        num1 = tecladoEntrada.nextInt();
        num2 = tecladoEntrada.nextInt();
        if (num1 > num2 ){
            System.out.println("num1 es mayor que num2");
        }else{
            System.out.println("num2 es mayor que num1");
        }
    }
}
