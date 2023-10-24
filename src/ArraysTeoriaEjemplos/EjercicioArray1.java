package ArraysTeoriaEjemplos;

import java.util.Scanner;

public class EjercicioArray1 {
    public static void main(String[] args) {
        // Leer por consola una frase
        // contar cuantas vocales tiene
        char[] vocales= {'a','e','i','o','u'};

 //declaracion de variables
 //primitivas
        int nVocales= 0;
        //instancia
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce una frase");
        String entrada= sc.nextLine();
        entrada= entrada.toLowerCase();

        for (int y = 0; y< entrada.length(); y++){
          char caracter = entrada.charAt(y);
            for(int i = 0;i < vocales.length; i++ ){
              nVocales++;
              break;
            }
        }
        System.out.println("La frase tiene " + nVocales + " vocales.");



    }
}
