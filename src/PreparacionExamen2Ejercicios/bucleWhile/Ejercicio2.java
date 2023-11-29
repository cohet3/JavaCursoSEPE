package PreparacionExamen2Ejercicios.bucleWhile;

public class Ejercicio2 {
    public static void main(String[] args) {
//        Calcular la potencia de 2 elevado a 8
        int exponente= 8;
        int base=2;
        int resultado=1;
        while (exponente>0){
            resultado *= base;
            exponente--;
        }
            System.out.println("2 elevado a 8 es -> "+resultado);

    }
}
