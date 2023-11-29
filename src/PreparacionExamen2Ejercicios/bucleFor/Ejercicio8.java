package PreparacionExamen2Ejercicios.bucleFor;

public class Ejercicio8 {
    public static void main(String[] args) {
  /*      Con los 20 primeros números decir con cada uno por cual es divisible:
        ejemplo: 1 --> es divisible por 1
        2 --> es divisible por 1
        es divisible por 2 ...*/
        for (int i = 1 ; i<= 20; i++){
            for (int y= 1; y<=20; y++)
            if (i%y == 0){
                System.out.println(i + " Es divisible " + y);

        }
    }
}
}
