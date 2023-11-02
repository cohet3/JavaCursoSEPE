package com.coreNetWork.modelos;

public class Ordenador {
    //1.atributos
    private String numSerie;
    private String modelo;
    private boolean portatil;

    //2.metodos

    @Override
    public String toString() {
        return "Ordenador{" +
                "numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", portatil=" + portatil +
                '}';
    }

    //3.constructores

    public Ordenador() {
    }

    public Ordenador(String numSerie, String modelo, boolean portatil) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.portatil = portatil;
    }
    //4.getters y setters

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }
}
