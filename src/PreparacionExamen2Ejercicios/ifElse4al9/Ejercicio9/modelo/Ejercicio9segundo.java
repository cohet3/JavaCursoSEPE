package PreparacionExamen2Ejercicios.ifElse4al9.Ejercicio9.modelo;

public class Ejercicio9segundo {
    public static void main(String[] args) {
        double aumento=0;
        int sueldo= 18000;
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
        }else if(sueldo >= 15000){
            aumento= sueldo*0.12+sueldo;
            System.out.println("linea 20"+aumento);
        }

    }
}
