package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Animal;

public class PruebaAnimal {
    public static void main(String[] args) {
        // Crear tres objetos de la clase animal con los nombres de pez, perro, gato
        Animal pez = new Animal();
        pez.setCarnivoro(true);
        pez.setMamifero(false);
        pez.setColorPelaje("rojo");

        System.out.println(pez.toString());
        System.out.println(pez.comer());
        System.out.println(pez.emitirSonido());

        Animal perro = new Animal(false, true, "marron");

        System.out.println(perro.toString());
        System.out.println(perro.comer());
        System.out.println(perro.emitirSonido());

        Animal gato = new Animal(true, true, "negro");

        System.out.println(gato.toString());
        System.out.println(gato.comer());
        System.out.println(gato.emitirSonido());
    }
}
