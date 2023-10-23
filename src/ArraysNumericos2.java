import java.util.Scanner;

public class ArraysNumericos2 {
    public static void main(String[] args) {
        // hay que declarar un array de 5 numeros, Poner los valores dede el codigo
        //obtener el número mayor
        //meter numeros por consola
        Scanner sc = new Scanner(System.in);

        int numeroGrande= 3;
        int [] numeros = new int[5];
        numeros[0]= sc.nextInt();
        numeros[1]= sc.nextInt();
        numeros[2]= sc.nextInt();
        numeros[3]= sc.nextInt();
        numeros[4]= sc.nextInt();
        for (int i = 0; i<numeros.length; i++){
            if (numeros[i]>numeroGrande){
                numeroGrande=numeros[i];
            }
        }
        System.out.println(numeroGrande);
    }
}
