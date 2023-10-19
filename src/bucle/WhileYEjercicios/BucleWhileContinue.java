package bucle.WhileYEjercicios;

public class BucleWhileContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10){
            i++;
            if (i==5){
                continue;
            }
            System.out.println(i);
            //No imprime el 5 pero continua el bucle
        }
    }
}
