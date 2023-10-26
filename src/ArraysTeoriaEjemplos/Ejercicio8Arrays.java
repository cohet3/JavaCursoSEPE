package ArraysTeoriaEjemplos;

public class Ejercicio8Arrays {
    public static void main(String[] args) {

/*
        Ejercicio 5
        Dado los siguientes arrays, hacer un bloque de código que construya un array de la siguiente manera:
        char[] cars1 = new char[]{'1','2','3','4','5','6'};
        char[] cars2 = new char[]{'a','e','r','t','y','u'};
        El array resultado que se debe de construir es el siguiente:
        char[] result = new char[]{'1','a','2','e','3','r','4','t','5','y','6','u'};*/
//declaramos varIABLES Y ARRAYS
        char[] cars1 = new char[]{'1','2','3','4','5','6'};
        char[] cars2 = new char[]{'a','e','r','t','y','u'};

        int longitudArray = cars1.length+cars2.length;
        int index= 0;
        char[] result = new char[longitudArray];

        for (int i =0; i<cars1.length; i++)
        {
            result[index++]= cars1[i];
            result[index++]= cars2[i];
        }
        for(char elemento: result){
            System.out.println(elemento);
        }


    }
}
