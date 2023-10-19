package bucle.WhileYEjercicios;

public class EjercicioWhileContinue {
    public static void main(String[] args) {
        //mostrar los primeros 5 numeros impares usando continue
        int i = 0;
        while (i<=5){
            i++;
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
