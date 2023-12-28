package javaIO.presentacion.Mecanismos28_12_2023.modelo;

import java.io.Serializable;

public class Ropa implements Serializable {

    //1. atributos
    protected double precio;
    protected String proveedor;
    private int numPrendas;
    //2. metodos
    public String probar(){
        return "Se esta probando";
    };
    public String desinfectar(){
        return "se esta desinfectando";
    };
    public String vender(){
        return "Se esta vendiendo";
    };
    //meteodos en comun

    public double getPrecio() {
        return precio;
    }
    public String getProveedor(){
        return proveedor;
    }
    //metodos generados automaticamente

    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }


    //3.constructores

    public Ropa() {
    }

    public Ropa(double precio, String proveedor, int numPrendas) {
        this.precio = precio;
        this.proveedor = proveedor;
        this.numPrendas = numPrendas;
    }

//4.gettersy setters


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumPrendas() {
        return numPrendas;
    }

    public void setNumPrendas(int numPrendas) {
        this.numPrendas = numPrendas;
    }
}
