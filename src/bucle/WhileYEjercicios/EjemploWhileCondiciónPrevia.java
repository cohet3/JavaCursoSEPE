package bucle.WhileYEjercicios;

public class EjemploWhileCondiciónPrevia {
    public static void main(String[] args) {
        //Comparaciñon de un bucle while y un do-while
        int i = 100;
        while (i<=10){
            System.out.println("Entra en el bucle = " +i);
            i++;
        }
        System.out.println("Terminacion del bucle");
        i=100;
        do{
            System.out.println("entra al bucle do-while = " +i);
            i++;
        } while (i<=10);
        System.out.println("sale del bucle do-while");
    }
}
