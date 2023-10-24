package ArraysTeoriaEjemplos;

import java.util.Scanner;

public class ArraysVectores {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        numeros [0] = 5;
        numeros [1] = 6;
        numeros [2] = 7;
        numeros [3] = 8;
        numeros [4] = 2;
        System.out.println(numeros[3]);
        System.out.println("Antes de entrar al for");
        for(int i = 0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        // definir un array de String
        //de 7 posicionesy asignarle valor(nombres
        String [] nombres  = new String[7];
        nombres[0] = "Daniel";
        nombres[1] = "Danzo";
        nombres[2] = "Bulma";
        nombres[3] = "Crilin";
        nombres[4] = "Naruto";
        nombres[5] = "Sacura";
        nombres[6] = "Padawan";

//StartWith EndsWith comienza o termina
        //cuantos comienzan por D
        int contador = 0;
        for( int i= 0 ;  i<nombres.length; i ++){
            System.out.println("nombre: " + nombres[i].startsWith("D"));
            if(nombres[i].startsWith("D")){
                contador++;
            }
        }
        System.out.println("contador de las que empiezan por D = "+ contador);

        // Declarar un array de 4 posiciones de tipo char y hay que leerlo por la consola
        //Scanner
        Scanner sc  = new Scanner(System.in);
        System.out.println("introduce un nombre o una palabra de 4 letras");
        String palabra= sc.next();
        System.out.println(palabra);
//        palabra.charAt(0);
        String [] letras =new String[4];
        for (int i = 0; i<4; i++ ){
            System.out.println(i+" == numero de iteraciones   "+palabra.charAt(i)+" = letras");

        }
        //Correción de la Profe
        char [] letras2 = new char[5];
        for (int i = 0; i< letras2.length; i++){
            System.out.println("Escriba la letra -> ");
            letras2[i]= sc.next().charAt(0);
            // lo mismo expresado en dos lineas
//            String palabra2 = sc.next();
//            letras2[i] = palabra.charAt(0);
        }
    }
}
