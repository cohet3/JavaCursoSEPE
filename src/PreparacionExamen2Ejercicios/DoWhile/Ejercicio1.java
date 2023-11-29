package PreparacionExamen2Ejercicios.DoWhile;

public class Ejercicio1 {
    public static void main(String[] args) {

            int base = 2;
            int exponente = 8;
            int resultado = 1;
            do {
                resultado *= base;
                exponente--;
            } while (exponente > 0);
            System.out.println ("2 elevado a 8 es: " + resultado);

    }
}
