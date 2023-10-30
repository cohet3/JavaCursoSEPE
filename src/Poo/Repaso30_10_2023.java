package Poo;

import java.util.Scanner;

public class Repaso30_10_2023 {
    public static void main(String[] args) {
        //definicion de variables
        char letra= 'j';
        boolean bandera= true;
        long numero= 8_000_000L;
        float numeroConDecimales= 0.5F;
        //Definicion de array
        int[] numeros= new int[5];
        //recorrer array
        for (int i =0; i<numeros.length; i++){
            numeros[i]= (i+1)*5;
            System.out.println(numeros[i]);
        }
        for (int elemento: numeros){
            System.out.println(elemento);
        }
        //leer por la consola una palabra y alamacenar cada letra en un arr
        //1 declaracion de variables y arr
        Scanner sc = new Scanner(System.in);
        char [] deletreo;
        String palabra;

        //2. esctructura
        //leer palabra
        System.out.println("Escribe una palabra");
        palabra= sc.nextLine();
        deletreo = new char[palabra.length()];

        for (int i=0; i <=deletreo.length;i++){
            deletreo[i]=palabra.charAt(i);
            System.out.println(deletreo[i]);
        }
        for (char elemento: deletreo){
            System.out.println(elemento);
        }

    }
}
