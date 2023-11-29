package PreparacionExamen2Ejercicios;

public class Ejercicio2Hoja2 {
    public static void main(String[] args) {
   /*     Ejercicio 1. Realizar un procedimiento main que realice el promedio de 5 números que se
        almacene en un array de números float y se muestren sus datos.*/

        float[] numeros = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
        float suma = 0.0f;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        float promedio = suma / numeros.length;
        System.out.println("El promedio de los números es: " + promedio);
    }
}
