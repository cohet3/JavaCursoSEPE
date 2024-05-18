package EjerciciosLibro.tablasndimensiones;

import java.util.Scanner;

public class Ejercicio2 {
//    2. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se obtiene la
//    misma tabla al cambiar las filas por columnas.
public static void main(String[] args) {
    int t[][];
    boolean simetrica;
    Scanner sc = new Scanner(System.in);
    int i,j;
    t = new int[4][4];
    for (i=0;i<4;i++)
    {
        for (j=0;j<4;j++)
        {
            System.out.print("Introduzca elemento ["+i+"]["+j+"]: ");
            t[i][j]=sc.nextInt();
        }

    }
    simetrica=true; // suponemos que la matriz es simétrica, y en caso de
// encontrar un caso donde t[i][j] sea distinta de t[j][i] pondremos
// simétrica a falso.
//una solución es mirar todos los elementos de la matriz, pero se hacen comprobaciones
// dobles, un ejemplo: comprobamos t[1][2] con t[2][1]... pero más tarde comprobaremos
// t[2][1] con t[1][2]
// la solución será mirar solo la zona inferior o superior a la diagonal principal.
// En el momento que tengamos la constancia de que no es simétrica, pararemos
// todas las comprobaciones
    i=0;
    while(i<4 && simetrica==true){
        j=0;
        while(j<i && simetrica==true){
            if(t[i][j]!=t[j][i])
                simetrica=false;
            j++;
        }
        i++;
    }
// si en algún momento se da: t[i][j]!=t[j][i] es que la matriz no es simétrica.
// si al llegar aquí y la variable simétrica vale true, indica que no hemos encontrado
// ningún valor que indique que la matriz no es simétrica.
    if(simetrica)
        System.out.println("SIMETRICA");
    else
        System.out.println("NO ES SIMETRICA");
}
}