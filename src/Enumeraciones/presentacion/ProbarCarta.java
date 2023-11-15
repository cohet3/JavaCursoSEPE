package Enumeraciones.presentacion;

import Enumeraciones.modelo.Baraja;
import Enumeraciones.modelo.Carta;
import Enumeraciones.modelo.Numeros;
import Enumeraciones.modelo.Palo;

public class ProbarCarta {
    public static void main(String[] args) {
        Carta c1= new Carta();
        c1.setNumero(Numeros.as);
        c1.setPalo(Palo.CORAZONES);
        System.out.println(c1.toString());
        Carta c2= new Carta(Palo.CORAZONES, Numeros.nueve);
        System.out.println(c2.toString());
        System.out.println("son iguales "+c1.equals(c2));
        Baraja b1= new Baraja();
        b1.getBarajas();
        System.out.println(b1.toString());
    }
}
