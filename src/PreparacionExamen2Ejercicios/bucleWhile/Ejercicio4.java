package PreparacionExamen2Ejercicios.bucleWhile;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Encontrar el primer número primo a partir de 198
        boolean primo;
        int count=198;
        int num=198;


        while (count<199){
            primo=true;
            for (int i = num-1 ; i>1; i--){
                if (num % i ==0){
                    primo=false;
                    break;
                }
            }
            if (primo){
                System.out.println("el primer numero primo a partir del 198->"+num);
                count++;
            }
            num++;
        }
    }
}
