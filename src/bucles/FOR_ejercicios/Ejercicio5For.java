package bucles.FOR_ejercicios;

import java.util.Scanner;

public class Ejercicio5For {
    public static void main(String[] args) {
        // 5.	Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
        //1. Declarar variables
        //primitivas
        int numero = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        float media = 0;
        float mediaNumerosNegativos = 0;
        int cantidadDeZeros = 0;
        int entre = 0;
        int entreNegativos= 0;
        //instancia
        Scanner sr = new Scanner(System.in);
        //Estructuras de control

        for(int i = 1; i <= 10; i++){
            System.out.println("escribe un numero -> ");
            numero = sr.nextInt();
            if( numero >=0){
                 entre += 1;
                System.out.println("entrePositivos"+entre);
                sumaPositivos = sumaPositivos + numero;
                media = sumaPositivos/entre;
                System.out.printf("media numero positivos->"+media);
            }else {
                entreNegativos += 1;
                sumaNegativos = sumaNegativos + (numero);
                System.out.println("entreNegativos"+entre);
                mediaNumerosNegativos = sumaNegativos/entreNegativos;
                System.out.printf("media numeros negativos ->"+mediaNumerosNegativos);
            }
        }
    }
}
