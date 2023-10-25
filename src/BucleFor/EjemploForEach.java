package BucleFor;

public class EjemploForEach {
    public static void main(String[] args) {
        int [] numeros = { 3,4,1,5,6,7};
        //recorrer la colección
        for (int elemento: numeros){
            System.out.println(elemento);
        }
        String[] palabras= {"casa", "coche", "aula", "ordenador"};
        //recorrer y mostrar en consola
        for (String elemento: palabras){
            System.out.println(elemento);
        }
        char [] letras = {'a','b','c','d'};
        for (char elemento: letras){
            System.out.println(elemento);
        }
    }
}
