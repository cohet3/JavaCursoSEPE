package bucle.WhileYEjercicios;

import java.util.Scanner;

public class Ejercicio5While {
    public static void main(String[] args) {
        //5. Pedir números hasta que se teclee un 0, mostrar la suma de todos los numerps introducidos
//1.Declarar variables
        //Primitivas
        int numeros = 0;
        int stop = 0;
        int suma = 0;
        //instancia
        Scanner sr = new Scanner(System.in);
        while (true){
            System.out.println("introduce un numero, si quieres ver la suma de los numeros introducidos teclea un 0");
            numeros = sr.nextInt();
            if (numeros != 0){
                suma = numeros+suma;
                System.out.println("el numero introducido es"+numeros +"La suma total es "+suma);
            }else {
                System.out.println("haz introducido un 0, hasta la próxima");
                break;
            }

        }

    }
}
