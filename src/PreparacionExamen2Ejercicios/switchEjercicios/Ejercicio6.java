package PreparacionExamen2Ejercicios.switchEjercicios;

public class Ejercicio6 {
    public static void main (String [] args) {
        int n = 10;
        int t1 = 0, t2 = 1;
        System.out.print("Los primeros " + n + " términos de la serie de Fibonacci son: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
