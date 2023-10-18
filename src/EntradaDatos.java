import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //declaracion de variables  - primitivas o instancia
        int numero;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escriba un numweo ->");
        numero = scanner.nextInt();
        System.out.println("El numero que se leyo fue " + numero);
        //Recibiendo por consola el sueldo
        double sueldo;
        System.out.println("Escriba un sueldo");
        sueldo = scanner.nextDouble();
        System.out.println("El numero que se leyó fue -> " + sueldo);

    }
}
