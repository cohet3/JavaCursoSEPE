package PreparacionExamen2Ejercicios.ifElse4al9.Ejercicio9.modelo;

public class Ejercicio9 {
    public static double main(String[] args) {
    /*    Ejercicio 9
        Se va a subir el sueldo a los empleados de la siguiente manera:
        Los que cobren < 15000 se les aumenta el 15%
                Los que cobren >= 15000 aumento del 12%
                además:
        Si son mujeres tienen un 2% adicional
        Si tienen hijos tienen un 1% adicional por hijo*/
        double aumento=0;
        int sueldo= 14000;
        boolean mujer=true;
        boolean hijos= true;
        if (sueldo<15000){
            aumento= sueldo*0.15+sueldo;
            System.out.println(aumento);
        }else if (mujer==true){
                 aumento=aumento * 0.02;
                 System.out.println(aumento);
        }else if (hijos==true){
                 aumento=aumento * 0.01;
                 System.out.println(aumento);
        }else {
            aumento= sueldo*0.12+sueldo;
            System.out.println(aumento);
        }

        return aumento;
    }
}
