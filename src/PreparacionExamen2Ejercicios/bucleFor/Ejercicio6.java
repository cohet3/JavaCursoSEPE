package PreparacionExamen2Ejercicios.bucleFor;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Hallar los números impares menores de 30 y que aparezcan en orden descendente

        for (int i = 30; i>0; i--){
            if (i%2!=0){
                System.out.println("es numero Impar -> "+ i);
            }

        }
    }
}
