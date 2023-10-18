import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //bucle echo a mano
        int num1=0;
        System.out.println("Escribe un numero");
        num1 = scanner.nextInt();
        System.out.println("numero leido " + num1);
        System.out.println("Escribe un numero");
        num1 = scanner.nextInt();
        System.out.println("numero leido " + num1);
        System.out.println("Escribe un numero");
        num1 = scanner.nextInt();
        System.out.println("numero leido " + num1);
        //Equivalente a un bucle
        for( int contadorIteraciones = 0; contadorIteraciones<3; contadorIteraciones++){
            System.out.println("escriba un numero");
            num1 = scanner.nextInt();
            System.out.println("numero leido " + num1);
        }
        //imprimir 10 veces en la consola
        for( int i = 0; i<10; i++){
            System.out.println(i+1);
        }
    }
}
