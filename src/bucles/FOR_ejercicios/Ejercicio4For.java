package bucles.FOR_ejercicios;

public class Ejercicio4For {
    public static void main(String[] args) {
//        4.	Diseñar un programa que muestre el producto de los 10 primeros números impares
        //declarar variables
        //primitivas
        int producto= 1;

        for (int i = 1; i<= 20; i += 2){
            System.out.println(i);
            producto *= i;
            System.out.println("Producto ->"+ producto);
        }

        //la tabla del 5
        for (int y = 1; y==10; y++){
            System.out.println(y);
            producto *=y;
            System.out.println(" tabla 5 ->"+ producto);

        }
    }
}
