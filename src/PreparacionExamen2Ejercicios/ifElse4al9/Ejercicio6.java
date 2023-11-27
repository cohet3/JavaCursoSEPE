package PreparacionExamen2Ejercicios.ifElse4al9;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero= 4;
        int numero2=3;
        int numero3= 1;
        if( numero>numero2 && numero>numero3){
            System.out.println("el numero mayor es el -> "+numero);
        }else if(numero2>numero && numero2>numero3) {
            System.out.println("El numero mayor es el -> "+numero2);
        }
        else if(numero3>numero && numero3>numero2) {
            System.out.println("El numero mayor es el -> "+numero3);
        }

    }
}
