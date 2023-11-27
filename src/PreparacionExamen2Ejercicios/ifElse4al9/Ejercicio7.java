package PreparacionExamen2Ejercicios.ifElse4al9;

public class Ejercicio7 {
    public static void main(String[] args) {
/*        Ejercicio 7
        Hallar una renta de C x r x t / 1200
        Si el tiempo es <=24 meses --> el redito es 5%
                Si el tiempo es <=60 meses --> el redito es 8%
                Si el tiempo es >60 meses --> el redito es 10%*/

        int tiempo= 69;
        if( tiempo<=24){
            System.out.println(" el redito es 5% ");
        }else if(tiempo<=60) {
            System.out.println(" el redito es 8% ");
        }
        else if(tiempo>60) {
            System.out.println(" el redito es 10% ");
        }

    }
}
