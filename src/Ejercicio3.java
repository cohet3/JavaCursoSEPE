import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3.Pedir un número y decir si es par o impar
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;

        num1 = tecladoEntrada.nextInt();

        if (num1 %2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }
}
