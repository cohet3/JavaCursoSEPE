package javaIO.presentacion.Mecanismos28_12_2023.modelo;

import java.io.Serializable;

public class Camisa extends Ropa implements Serializable {
    //1.Atributos
    private boolean corta;
    private double tallaCuello;
    //2.metodos
    private String desteñir(){
        return "estamos comprobando si destiñe";
    }

//3.constructores

    public Camisa() {
    }

    public Camisa(boolean corta, double tallaCuello) {
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }

    public Camisa(double precio, String proveedor, int numPrendas, boolean corta, double tallaCuello) {
        super(precio, proveedor, numPrendas);
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }


    //4.getters y setters


    public boolean isCorta() {
        return corta;
    }

    public void setCorta(boolean corta) {
        this.corta = corta;
    }

    public double getTallaCuello() {
        return tallaCuello;
    }

    public void setTallaCuello(double tallaCuello) {
        this.tallaCuello = tallaCuello;
    }
}
