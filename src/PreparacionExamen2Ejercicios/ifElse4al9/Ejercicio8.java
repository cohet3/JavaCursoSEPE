package PreparacionExamen2Ejercicios.ifElse4al9;

public class Ejercicio8 {
    public static void main(String[] args) {
/*        Ejercicio 8
        Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo:
        Es par y múltiplo de 3
        Es impar y múltiplo de 3
        Identificadores, palabras claves y tipos
        Página 4/7
        No es múltiplo de 3 pero es par
        No es ni par ni múltiplo de 3*/
        int numero= 9;
        if(numero%2==0 && numero%3==0){
            System.out.println("el número es par y múltiplo de 3");
        } else if (numero%2!=0 && numero%3==0) {
            System.out.println("El numero es impar y múltiplo de 3");
        } else if (numero%2==0 && numero%3!=0) {
            System.out.println("El numero No es multiplo de 3 pero es par");
        } else {
            System.out.println("No es ni par ni multiplo de 3");
        }

    }
}
