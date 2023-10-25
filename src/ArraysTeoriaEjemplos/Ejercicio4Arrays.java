package ArraysTeoriaEjemplos;

public class Ejercicio4Arrays {
    public static void main(String[] args) {
/*        Crear un bloque de código que recorra los siguientes arrays y me cree otro que contenga las componentes de ambos dos. Los arrays son los siguientes:
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{334,23,4};
        El array resultado es el siguiente:
        int[] array3 = new int[]{1,2,3,4,5,334,23,4};*/
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{334,23,4};
        // crear un tercer array vacio de x posiciones
        int sumaPosiciones= array1.length+array2.length;
        int[] array3 = new int[sumaPosiciones];
        //bucle para recorrer el primer array
        for (int i = 0; i< array1.length; i++){
            array3[i]=array1[i];
        }
        //bucle para añadir el segundo al primero
        for (int i = 0; i< array2.length; i++){
            array3[array1.length+i]=array2[i];
        }
        //bucle para leer el arr3
        System.out.println("el array3 nos quedaría");
        for (int i = 0; i<array3.length; i++)

        System.out.println(array3[i]);
    }
}
