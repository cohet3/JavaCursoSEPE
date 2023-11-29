package PreparacionExamen2Ejercicios.DoWhile;

public class Ejercicio3 {
    public static void main (String [] args) {
        int num = 10;
        int suma = 0;
        do {
            if (num % 2 == 0) {
                suma += num;
            }
            num++;
        } while (num <= 50);
        System.out.println ("La suma de los números pares entre 10 y 50 es: " + suma);
    }
}
