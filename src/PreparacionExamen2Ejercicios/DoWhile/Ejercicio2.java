package PreparacionExamen2Ejercicios.DoWhile;

public class Ejercicio2 {
    public static void main (String [] args) {
        int n = 10; // número de términos a calcular
        int t1 = 0, t2 = 1;
        System.out.print("Los primeros " + n + " términos de la serie de Fibonacci son: ");

        do {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            n--;
        } while (n > 0);
    }
}
