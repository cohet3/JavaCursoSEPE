package EjerciciosLibro.VariablesyCondicionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class backendEjercicio3 {
//atributos
int numero;
private int estrella;
private int[] numeros= new int[6];
    //metodos
    public void numeroAleatorio(){
        Random numeroAleatorio= new Random();
        for (int i = 0; i<numeros.length; i++){
            numeros[i]=numeroAleatorio.nextInt(1,40);
        }
        estrella=numeroAleatorio.nextInt(1,5);
    }
    public void scanner(){
        Scanner scanner=new Scanner(System.in);
        numero= scanner.nextInt();
    }
    public void contador(){
        numero++;
    }

    @Override
    public String toString() {
        return "backendEjercicio3{" +
                "numero=" + numero +
                ", estrella=" + estrella +
                ", numeros=" + Arrays.toString(numeros) +
                '}';
    }
    //constructores

    public backendEjercicio3() {
    }

    public backendEjercicio3(int numero, int estrella, int[] numeros) {
        this.numero = numero;
        this.estrella = estrella;
        this.numeros = numeros;
    }

    //getters y setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
