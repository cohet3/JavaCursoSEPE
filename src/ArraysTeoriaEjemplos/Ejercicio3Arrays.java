package ArraysTeoriaEjemplos;

public class Ejercicio3Arrays {
    public static void main(String[] args) {
        // crear un bucle que pinte por consola todas las compoenentes de un array en orden inverso a como estan guardados en el array
        //1. difinir arr
        int [] numeros = {5,4,7,9,8};
        //2. en un bucle recorrerlo ( cambiar valor inicial. condicion , modificacion de la i)
for (int i =numeros.length-1; i>=0; i--){

    System.out.println("numeros de la posicion  "+i +" con valor ->" +numeros[i]);

}
    }
}
