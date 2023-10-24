package ArraysTeoriaEjemplos;

public class ArraysNumericos {
    public static void main(String[] args) {
        // hay que declarar un array de 5 numeros, Poner los valores dede el codigo
        //obtener el número más pequeño
        int numeroPequeño= 3;
        int [] numeros = new int[5];
        numeros[0]= 2;
        numeros[1]= 3;
        numeros[2]= 4;
        numeros[3]= 5;
        numeros[4]= 6;
        for (int i = 0; i<numeros.length; i++){
            if (numeros[i]<numeroPequeño){
                numeroPequeño=numeros[i];
            }
        }
        System.out.println(numeroPequeño);
    }
}
