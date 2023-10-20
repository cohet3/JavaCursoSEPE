package bucle.WhileYEjercicios;

import java.util.Scanner;

public class Ejercicio6While {
    public static void main(String[] args) {

        /*     6. Pedir numeros hasta q se introduzca uno negativo, y calcular la media*/
        //1.Declarar variables
        //2.Primitivas
        int numeros= 0;
        int suma= 0;
        int cantidadNumeros= 0;
        int media= 0;
        //3.instancia
        Scanner sr = new Scanner(System.in);
        while (true){
            numeros= sr.nextInt();
            System.out.println("introduce un numero, Si quieres detener el programa intruduzca uno negativo");
            if (numeros >= 0){
                suma = numeros+suma;
                cantidadNumeros++;
                media = suma/cantidadNumeros;

                System.out.println(" el numero introducido es "+numeros +" La suma total es "+suma+ " la media sería "+ media);
            }else {
                System.out.println("haz introducido un 0, hasta la próxima");
                break;
            }

        }

    }
}
