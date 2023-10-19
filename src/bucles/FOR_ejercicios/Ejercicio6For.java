package bucles.FOR_ejercicios;

import java.util.Scanner;

public class Ejercicio6For {
    public static void main(String[] args) {
       /* 6.	Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.*/
        //declaramos variables
        int sueldos = 0;
        int suma = 0;
        int mayores= 0;
        //variables de instancia
        Scanner sr = new Scanner(System.in);
        for(int i = 1; i <= 4; i++){
            System.out.println("Escribe tu sueldo");
            sueldos = sr.nextInt();
            suma = sueldos +suma;
            if(sueldos >=  1000) {
                mayores +=1;
                System.out.println("Sueldos mayores a 1000€ -> "+mayores);

            }
            System.out.println("suma total = " + suma);
        }
    }
}
