package Repaso12_01_2024.corenetworks.presentacion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaracion de variagbles
        //numericos
        byte vByte = 127;
        short vshort=1_200;
        int vInt = 1_000_000;
        long vLong= 1_00L;
        float vFloat = 230.34F;
        double vDouble= 3_000.23;
        char vChar = 'a';
        boolean vBoolean= true;
        //Clases envolventes
        Byte ebyte= 17;
        Short eshort = (short)120;
        Integer eInteger= 123_456;
        Long eLOng= 123_123_123L;
        Float eflot= 1.23f;
        Double eDouble= 123_123.98;
        Character eChar = 'a';
        Boolean eBoolean = true;
        //convertir un caracter del valor 5 a integer
        int variable = Integer.parseInt("5");
        //convertir un string con valor
        //convertir un string con valor 5.7 a double
        Double num = Double.parseDouble("5.7");
        System.out.println(num);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribir un nunmero con decimales");
        //double nPorConsola = teclado.nextDouble();
        //Convertir un Double a String
        System.out.println("Double convertido a String -> " + eDouble.toString());
        Object o = new Object();
        System.out.println("Método to String de o ->" + o.toString());
        //String
        String nombre= "Pablo ";
        String apellido=  "Escobar";
        System.out.println("Nombre completo -> "+nombre+" "+apellido);
        System.out.printf("Nombre completo %s %s->",nombre,apellido);
        //Definir : edad y sueldo y sueldo double
        int edad=23;
        Double sueldo = 3600d;
        System.out.printf("Su nombre es --> %25s %25s, tiene %d y gana %.2f %n",nombre,apellido,edad,sueldo);
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.indexOf('a'));
        System.out.println(nombre.replace("a", "A"));
        System.out.println(nombre.contentEquals("b"));
        System.out.println(nombre.contains("o"));
        System.out.println(nombre.substring(1,3));
        String valores = "1/5/8/12";
        String[] valoresSeparados = valores.split("/");
        System.out.println(Arrays.toString(valoresSeparados));
        //Solicitar una frase y dividirlo por palabras
        System.out.println("Escribe una frase");
        String frase = teclado.nextLine();
        String[] palabraseparadas = frase.split(" ");
        System.out.println(Arrays.toString(palabraseparadas));



    }
}
