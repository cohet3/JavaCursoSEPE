package ArraysTeoriaEjemplos;

public class Ecjercio7Arrays {
    public static void main(String[] args) {
/*        Dado el siguiente array de números,
        crear un bloque de código que sume por un lado solo los números pares y devuelva el resultado y
        por otro solo los impares y también pinte el resultado
        int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};*/
// 1 variables, primitivas
        int sumaPares= 0;
        int sumaImpares= 0;
        int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
        //2. eSTRUCTURAS DE CONTROL
            for (int i = 0; i< numeros.length; i++){
                if (numeros[i]%2==0){
                    sumaPares+= numeros[i];
                }else{
                    sumaImpares+= numeros[i];
                }
            }
        System.out.println("la suma de los numeros pares es = " +sumaPares);
        System.out.println("la suma de los impares es = "+sumaImpares);

    }
}
