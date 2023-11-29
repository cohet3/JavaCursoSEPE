package PreparacionExamen2Ejercicios.bucleWhile;

public class Ejercicio5 {
    public static void main(String[] args) {
/*        Un numero es perfecto cuando todos sus divisores sumados dan el mismo numero
        Ejemplo: 6 = 1 + 2 + 3; luego 6 es un numero perfecto
        Mostrar los números perfectos hasta el 100*/
        //1. declaracion de variables
        int num = 1;
        int suma;
        while (num <=100){
            suma= 0;
            for (int i =1; i<num; i++){
                if (num%i == 0){
                    suma+= i;
                }
            }
            if (suma == num){
                System.out.println(num+ " Es un número perfecto");
            }
            num++;
        }
    }
}
