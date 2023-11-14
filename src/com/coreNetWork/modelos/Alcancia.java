package com.coreNetWork.modelos;

public class Alcancia {
/*    Ejercicio 2
Se quiere construir un programa para manejar una alcancía. En la alcancía es posible guardar monedas de distintas
denominaciones: $50, $100, $200, $500 y $1000. No se guardan billetes o monedas de otros valores.
El programa debe dar las siguientes opciones:
1. Agregar una moneda de una de las denominaciones que maneja,
2. Informar cuántas monedas tiene de cada denominación
3. Calcular el total de dinero ahorrado
4. Romper la alcancía, vaciando su contenido*/
    //1.Atributos
    private int moneda50;
    private int moneda100;
    private int moneda200;
    private int moneda500;
    private int moneda1000;
    //un array para contabilizar la alcancia
    private int [] alcancia = new int[5];


    //2.metodos
    public void agregarMoneda(int moneda50, int moneda100, int moneda200, int moneda500, int moneda1000){
        for (int i= 0; i<alcancia.length; i++){
//            if (alcancia[i]==)
        }
    }
    //3. constructores
    //4. gettersy setters

}
