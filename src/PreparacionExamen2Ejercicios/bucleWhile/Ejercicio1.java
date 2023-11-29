package PreparacionExamen2Ejercicios.bucleWhile;

public class Ejercicio1 {
    public static void main(String[] args) {
//        Calcular el factorial de 25
        //1. declaración de variables
        int num= 25;
        long factorial= 1;
        while (num> 0){
            factorial *= num;
            num--;
        }
        System.out.println("El factorial de 25 es "+factorial);
    }
}
