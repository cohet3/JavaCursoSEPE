package bucles.FOR_ejercicios;

public class Ejercicio4For {
    public static void main(String[] args) {
//        4.	Diseñar un programa que muestre el producto de los 10 primeros números impares
        //declarar variables
        //primitivas
        int impar = 1;
        int producto= 1;

        for (int i = 1; i<= 20; i += 2){
            System.out.println(i);
            producto *= i;
            System.out.println("Producto ->"+ producto);

        }
    }
}
