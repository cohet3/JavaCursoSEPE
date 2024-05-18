package EjerciciosLibro.tablasndimensiones;

public class ejercicio1 {
//    1. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
//    debe contener n+m. Después se debe mostrar su contenido.
    public static void main(String[] args) {
        int t[][]; // definimos t como una tabla bidimensional
        t = new int [5][5]; // creamos la tabla de 5x5
        for (int i=0;i<5;i++) // utilizamos i para la primera dimensión
        {
            for (int j=0;j<5;j++) // utilizamos j para la segunda dimensión
            {
                t[i][j]=i+j;
            }
        }
        System.out.println("TABLA: ");
        for (int i=4;i>=0;i--)
        {
            System.out.println();
            for (int j=0;j<5;j++)
            {
                System.out.print(t[i][j]+" ");
            }
        }
    }
}
