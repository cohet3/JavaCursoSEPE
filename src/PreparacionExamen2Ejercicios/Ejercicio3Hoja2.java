package PreparacionExamen2Ejercicios;

public class Ejercicio3Hoja2 {
/*    Ejercicio 2. Realizar un procedimiento main que realice la suma de dos matrices, se inicializan
    las matrices en el procedimiento y se muestra el resultado.*/
public static void main(String[] args) {
    int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    int[][] resultado = new int[3][3];

    for (int i = 0; i < matriz1.length; i++) {
        for (int j = 0; j < matriz1[0].length; j++) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }

    System.out.println("Matriz 1:");
    imprimirMatriz(matriz1);
    System.out.println("Matriz 2:");
    imprimirMatriz(matriz2);
    System.out.println("Resultado:");
    imprimirMatriz(resultado);
}

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
