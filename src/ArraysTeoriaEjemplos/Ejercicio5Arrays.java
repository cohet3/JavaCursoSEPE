package ArraysTeoriaEjemplos;

public class Ejercicio5Arrays {
    public static void main(String[] args) {
   /*   Ejercicio 7
        Dado el siguiente array crear un bloque de código que sume todas las componentes del array,
        para ello hacer uso de un bucle que vaya obteniendo todos los valores del array
        float[] decimales = {3.4F,5.67F,12.0F,3.141615F,0.0F};*/
        //definimos variables
        float[] decimales = {3.4F,5.67F,12.0F,3.141615F,0.0F};
        float suma= 0F;
        //bucle
        for (int i= 0; i< decimales.length;i++){
            suma += decimales[i];
        }
        System.out.println("la suma total es = " +suma);
    }
}

