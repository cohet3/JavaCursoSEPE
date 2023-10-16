import java.util.Scanner;

public class EjerciciosIF {
    public static void main(String[] args) {
        //1.Pedir dos números y decir si son iguales o no
        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        num1 = tecladoEntrada.nextInt();
        num2 = tecladoEntrada.nextInt();
        if (num1 == num2){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros no son iguales");
        }







        //9. Pedir un numero entre 0 y 9999 y mostrarlos con las cifras

    }
}
