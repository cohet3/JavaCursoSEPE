import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //4.Pedir dos numeros y decir si un es multiplo del otro
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        num1 = tecladoEntrada.nextInt();
        num2 = tecladoEntrada.nextInt();
        if (num1 % num2 ==0){
            System.out.println("Los numeros son multiplos");
        }else{
            System.out.println("Los numeros no son multiplos");
        }
    }
}
