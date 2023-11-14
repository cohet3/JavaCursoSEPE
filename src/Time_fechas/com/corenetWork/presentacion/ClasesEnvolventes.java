package Time_fechas.com.corenetWork.presentacion;

public class ClasesEnvolventes {
    public static void main(String[] args) {
        //Tipos primitivos -> Convertirlos como objetos
        int i= 5;
        Integer iEnvolvente= i;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String numero = "4";
        System.out.println(Integer.parseInt(numero));
        float sueldo = 1_500.50F;
        Float sEnvolvente= sueldo;
        System.out.println("maximo valor de float"+Float.MAX_VALUE);
        System.out.println("valor minimo de float"+Float.MIN_VALUE);
        System.out.println("de float a string ->"+Float.parseFloat("1500.5"));
        char letra = 'a';
        Character lEnvolvente = letra;
        System.out.println("Caracter envolvente -> "+ lEnvolvente);
        //unboxing
        int i2 =iEnvolvente;
        System.out.println(" clase envolvente convertida a primitivo "+ i2);
        char letra2 = lEnvolvente;
        System.out.println("character envolvente convertido a char "+ letra2);
    }
}
