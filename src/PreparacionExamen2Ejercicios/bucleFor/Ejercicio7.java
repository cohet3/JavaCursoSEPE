package PreparacionExamen2Ejercicios.bucleFor;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Hallar todas las tablas de multiplicar con bucles anidados
        for (int i = 1; i<=10; i++){
            System.out.println("tabla de multiplicar del : "+i);
            for (int y= 1; y<=10; y++){
                System.out.println(i+" * " +y+ " = "+ i*y);
            }
        }
    }
}
