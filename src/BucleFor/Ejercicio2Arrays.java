package BucleFor;

import java.util.Scanner;

public class Ejercicio2Arrays {
    public static void main(String[] args) {
//        crear un bloque de codigo que lea las componentes de un array de enteros y me pinte cuales son pares,
//        cuales los impares y cuales son múltiplos de tres
        //para este ejercicio utilizaremos un bucle que recorra el array y utilizar el operador %
        //variable
        int [] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< numeros.length; i++){
            System.out.println("introduce un numero en la posicion -> "+ i);
            numeros[i] = sc.nextInt();
        }
        for (int y = 0; y<numeros.length; y++ ){
            if (numeros[y]%2==0){
                System.out.println("los nunmeros son par =" + numeros[y]);
            }else{
                System.out.println("los numeros son impar =" + numeros[y]);
            }if (numeros[y]%3 == 0){
                System.out.println("estos numeros son multiplos de 3 = " + numeros[y]);
            }else {
                System.out.println("estos numeros NO son multiplos de 3 = " + numeros[y]);
            }
        }

    }
}
