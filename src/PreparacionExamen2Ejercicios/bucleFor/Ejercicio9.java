package PreparacionExamen2Ejercicios.bucleFor;

public class Ejercicio9 {
/*    public static void main(String[] args) {
//        Hallar la lista de los números primos hasta el 100
        for (int i = 1 ; i<= 100; i++){
            for (int y= 1; y<=9; y++)
                if (i%y != 0){
                    System.out.println( " numeros primos " + i);

                }
        }
    }*/
    public static void main (String [] args) {
        boolean primo;
        System.out.println ("Son números primos del 1 al 100:\n");
        // Estructura for
        for (int num = 2; num <= 100; num++) {
            primo = true;
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println (num + " es primo");
            }
        }
    }
}

