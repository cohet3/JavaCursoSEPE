public class Strings {
    public static void main(String[] args) {
        String nombre = "Manolo";
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.length());
        System.out.println(nombre);
        System.out.println(nombre.isEmpty());
        System.out.println(nombre.indexOf("n"));
        System.out.println(nombre.indexOf("o"));
        System.out.println(nombre.lastIndexOf("o"));
        System.out.println(nombre.concat(" dice holaa"));
        System.out.println(nombre.substring(3));
        System.out.println(nombre.substring(2, 4));
        //Ejercicio 1 dada la cuenta bancaria 1234567890123456789
        // Se pide extraer los primeros dos digitos

        // se pide extraer de la posicion 4 a la 9
        String cuentaBancaria = "1234567890123456789";
        System.out.println(cuentaBancaria.substring(0,2));
        //se pide extraer los 10 últimos
        System.out.println(cuentaBancaria.substring(9));
        //se pide extraer de la posicion 4 a la 9
        System.out.println(cuentaBancaria.substring(4,10));

        //Ejercicio2
        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”

         */
        String texto = "“Nunca mates una mosca sobre la cabeza de un tigre.”";
         //• Mostrar la cadena toda en mayúsculas
        System.out.println(texto.toUpperCase());
        // • Mostrar la cadena en minúsculas
        System.out.println(texto.toLowerCase());
        //• Mostrar solo la palabra Nunca
        System.out.println(texto.substring(1,6));
        //• Mostrar solo la palabra mosca
        //solucion en dos pasos
        int posicionInicial = texto.indexOf("mosca");
        System.out.println(posicionInicial);
        System.out.println("mosca".length());
        System.out.println("("+ texto.substring(posicionInicial,posicionInicial+"mosca".length())+")");
        //solucion en un paso
        System.out.println(texto.substring(17,22));
        //• Mostrar la palabra cabeza
        System.out.println(texto.substring(32,38));
        //• Mostrar la posición de la letra primera m
        System.out.println(texto.indexOf("m"));
        //• Devolver la longitud de la cadena
        System.out.println(texto.length());







    }
}
