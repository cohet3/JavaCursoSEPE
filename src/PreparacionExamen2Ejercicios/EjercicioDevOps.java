package PreparacionExamen2Ejercicios;

public class EjercicioDevOps {
    public static void main(String[] args) {
/*        DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.
        Mostrar el numero de caracteres del texto anterior
        Mostrar la posicion de la primera palabra DevOps
        Mostrar la posicion de la ultima palabra menos
        Mostrar el texto en mayuscula
        Mostrar el texto en minúscula
        Extraer la primera palabra trabajo*/
        String frase= "DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.";
        System.out.println(frase.length());
        System.out.println(frase.indexOf("DevOps"));
        System.out.println(frase.indexOf("menos"));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        String[] palabras = frase.split(" ");
        System.out.println(palabras[5]);
        //Extraer la primera palabra trabajo 2 forma solo con metodos de string
        System.out.println(frase.indexOf("trabajo"));
        System.out.println(frase.indexOf("trabajo")+"trabajo".length());
        System.out.println("Extraer trabajo (" + frase.substring(frase.indexOf("trabajo"),frase.indexOf("trabajo")+"trabajo".length())+")");

    }
}
