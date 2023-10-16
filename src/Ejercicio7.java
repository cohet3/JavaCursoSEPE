import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //7. Pedir tres numeros y mostrarlos ordendos de mayor a menor
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        num1 = tecladoEntrada.nextInt();
        num2 = tecladoEntrada.nextInt();
        num3 = tecladoEntrada.nextInt();
        int numeroMayor = 0;
        if (num1 > num2 && num2 > num3 ){
            numeroMayor = num1;
            System.out.println("el num1 es mayor  " + numeroMayor);
        }
        if (num2 > num3 && num2 > num1 ){
            numeroMayor = num2;
            System.out.println("el num2 es mayor  " + numeroMayor);
        }
        if (num3 > num1 && num3 > num2){
            numeroMayor = num3;
            System.out.println("el num3 es mayor  " + numeroMayor);
        }

    }
}
