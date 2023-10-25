package BucleForEach;

import java.util.Scanner;

public class EjercicioArray1_2 {
    public static void main(String[] args) {
        //definir variables
        String frase="";
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Introduce una frase para contar sus vocales ");
        frase = sc.nextLine();
        //bucle
        for (int i = 0; i< frase.length(); i++){
        switch (frase.charAt(i)) {// con frase.charAt(i) con esto lo trasformamos en array la frase!!!!!
            case 'a', 'e', 'i', 'o', 'u':
                contador++;
                break;
        }

        }
        System.out.println("la frase tiene "+ contador+ " vocales");
    }
}
