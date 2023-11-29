package PreparacionExamen2Ejercicios.bucleWhile;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Calcular los 25 primeros números primos, NO DEL 1 AL 25
        //1.declaracion de variables
        boolean primo;
        int count=0;
        int num=2;


        while (count<25){
            primo=true;
            for (int i = num-1 ; i>1; i--){
                if (num % i ==0){
                    primo=false;
                    break;
                }
            }
            if (primo){
                System.out.println("los 25 numeros primos->"+num);
                count++;
            }
            num++;
        }
    }
}
