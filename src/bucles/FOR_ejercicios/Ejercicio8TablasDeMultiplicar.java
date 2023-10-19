package bucles.FOR_ejercicios;

public class Ejercicio8TablasDeMultiplicar {
    public static void main(String[] args) {
        //Saca las tablas de multiplicar del 1 al 10

        for (int i = 1; i <= 10; i++){
            System.out.println("Tabla de Multiplicar del  " + i);
            for (int y = 1; y<=10; y++){
                System.out.println(i + " * " + y + " = " + i*y);
            }
        }
    }
}
