package PreparacionExamen2Ejercicios.switchEjercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
/*        Con varias estructuras switch ... case ver si un número es divisible por 2,3 o por 5*/
        //1. declaración de variables
        int numero=15;
        switch (numero%2){
            case 0:
                System.out.println("el numero es divisible entre 2");
                break;
            default:
                System.out.println("el numero no es divisible entre 2");
        }
        switch (numero%3){
            case 0:
                System.out.println("el numero es divisible entre 3");
                break;
            default:
                System.out.println("el numero no es divisible entre 3");
        }
        switch (numero%5){
            case 0:
                System.out.println("el numero es divisible entre 5");
                break;
            default:
                System.out.println("el numero no es divisible entre 5");
        }
    }
}
