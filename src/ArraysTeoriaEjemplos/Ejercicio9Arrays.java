package ArraysTeoriaEjemplos;

public class Ejercicio9Arrays {
    public static void main(String[] args) {
        //1. defeinir un array de 5 letras
        char [] letras = new char[5];
        //un bucle para recorrerlo
        for (int i =0; i<letras.length;i++){
            letras[0]= 'a';
            letras[1]= 'e';
            letras[2]= 'i';
            letras[3]= 'o';
            letras[4]= 'u';

        }
        for (char elemento: letras){
            System.out.println(elemento);
        }

    }
}
