package Enumeraciones.modelo;

import java.util.Arrays;

public class Baraja {
    private Carta[] barajas;

    public Carta[] getBarajas() {
        return barajas;
    }

    public void setBarajas(Carta[] barajas) {
        this.barajas = barajas;
    }

    public Baraja(Carta[] barajas) {
        this.barajas = barajas;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "barajas=" + Arrays.toString(barajas) +
                '}';
    }

/*    public Baraja() {
        barajas= new Carta[52];
        int indice= 0;
            for (Palo palo : Palo.values()) {
                for (Numeros numero : Numeros.values()) {
                    barajas[indice] = new Carta(palo, numero);
                    indice++;
                }

        }

    }*/
    public  Baraja() {

        barajas = new Carta[52];
        int indice = 0;
        for (int i = 0; i < Palo.values().length; i++) {
            for (int j = 0; j < Numeros.values().length; j++) {
                barajas[indice]= new Carta(Palo.values()[i],Numeros.values()[j]);
                indice++;

            }
        }
    }
}
