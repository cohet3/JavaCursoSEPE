package TryCatch.com.coreNetworks.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //Declaracion de variables
        int dato;
        Scanner sc= new Scanner(System.in);
        //Recibir un dato
        System.out.println("escriba un dato númerico");
        try {
            dato= sc.nextInt();
        }catch (InputMismatchException i1){
            System.out.println("El dato que se pidio fue númerico :( ");
        }finally {
            System.out.println("Entra al finally");
        }

    }
}
