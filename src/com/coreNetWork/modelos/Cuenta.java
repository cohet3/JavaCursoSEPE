package com.coreNetWork.modelos;

public class Cuenta {
    //1. atributos
    private String titular;
    private double cantidad;

    //2. metodos son3
    public void ingresar(double cantidad){
        if (cantidad>0){
            this.cantidad = this.cantidad+cantidad;
        }
//utilizamos void porque no estan retornando valor solo estan modificando cantidad
    }
    public void retirar(double cantidad) {
        if (cantidad<=this.cantidad)
            this.cantidad = this.cantidad - cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    //3. constructores

    public Cuenta(String titular) {
        this.titular = titular;
    }
//creo dos para q uno requiera el titular y el otro no
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    //4. Getters and setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
