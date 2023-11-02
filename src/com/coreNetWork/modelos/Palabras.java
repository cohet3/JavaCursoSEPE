package com.coreNetWork.modelos;

import java.util.Arrays;

public class Palabras {
    //1.atributos
    private String[] palabras;
    //se puede mejorar para hacerlo flexible el length del array
    //2.metodos
    public void actualizaElemento(String contenido, int posicion){
        for (int i = 0; i< palabras.length; i++){
        if (palabras[i]==palabras[posicion]){
            palabras[posicion] = contenido;
        }
        }
    }
    public void palabra (int elementos){
        palabras = new String[elementos];
    }

    @Override
    public String toString() {
        return "Palabras{" +
                "palabras=" + Arrays.toString(palabras) +
                '}';
    }
    //3.constructores

    public Palabras() {
    }

    public Palabras(String[] palabras) {
        this.palabras = palabras;
    }
    //4 getters y setters

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
}
