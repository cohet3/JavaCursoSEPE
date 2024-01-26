package Repaso12_01_2024.corenetworks.presentacion;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {

        int cantidad = 50;
        if (cantidad > 100){
            System.out.println("El descuento es de 3%");
        }else {
            System.out.println("El descuento es del 1%");
        }
        LocalDate fechaPedido = LocalDate.of(2024, 1, 3);
        if(fechaPedido.isBefore(LocalDate.now())){
            System.out.println("Es una fecha Anterior");
        }else {
            System.out.println("Es una fecha posterior");
        }
        //La letra e es ejecucion la w esperando la f terminado en caso de que no sean esas letras valor invalido
      Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Ingrese una letra (e, w, f): ");
        char letra = scanner.next().charAt(0);

        switch (letra) {
            case 'e':
                System.out.println("Ejecución");
                break;
            case 'w':
                System.out.println("Esperando");
                break;
            case 'f':
                System.out.println("Terminado");
                break;
            default:
                System.out.println("Valor inválido");
        }*/
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }
        //Sumar los numero que acepten en consola
        //parar cuando el usuario escriba un cero
        int suma = 0;
        int numero=1;
        while (numero != 0){
            System.out.println("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();
            suma += numero;

        }
        System.out.println("La suma de los números ingresados es: " + suma);

        int [] numeros = {3,2,5,8,10};
        //decir si existe un numero en el array y recibirlo por la consola
        //hacerlo con el foreach
        System.out.println("Ingrese un número para buscar en el array: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int num : numeros) {
            if (num == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " existe en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no existe en el array.");
        }

    }
}
