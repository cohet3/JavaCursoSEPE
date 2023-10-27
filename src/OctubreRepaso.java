import java.util.Scanner;

public class OctubreRepaso {
    public static void main(String[] args) {
        String [] palabras = new String[6];
        Scanner sc = new Scanner(System.in);
        //rellenar  este array
        for (int i = 0; i<palabras.length; i++){
            System.out.println("Escribe una palabra de la posicion " + i);
            palabras[i] = sc.nextLine();
        }
        //MOstras la informacion del array
        for(int i = 0; i< palabras.length; i++){
            System.out.println("las palabras escritas son = "+palabras[i]);
        }
        //mostrar palabras a la inversa
        for(int i = palabras.length-1; i>=0; i--){
            System.out.println("las palabras escritas a la inversa son = "+palabras[i]);
        }

        // usando for-each
       for(String elemento: palabras){
           System.out.println("las palabras escritas son = "+elemento);
       }

    }
}
