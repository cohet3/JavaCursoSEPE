package Poo;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        //Leer por consola una palabra
        //definir un array de string obtener logitud del arr y almacenar en cada posicion dos letras
        //declaracion de variables
        String [] letras;
        String palabra;
        Scanner sc= new Scanner(System.in);

        //estructura
        System.out.println("Introduce una palabra para dividirla en letras de 2 en 2");
        palabra = sc.nextLine();

//con el if, else controlamos la longitud del numero de palabras par o impar
    if(palabra.length()%2== 0){
        letras= new String[palabra.length()/2];

        }else {
        letras= new String[palabra.length()/2+1];

    }
    //bucle para asignar valor al Arr creado por el if
for (int i=0; i< letras.length; i++){
    //estaba
    int posicionInicial = i*2;
    System.out.println(posicionInicial);
    if(palabra.length()%2!=0 && i==letras.length-1){
        //es impar y controlamos la ultima iteración
        letras[i]= palabra.substring(posicionInicial);
        break;
    }
    letras[i]=palabra.substring(posicionInicial,posicionInicial+2);
    System.out.println(letras[i]);

}


    }
}
