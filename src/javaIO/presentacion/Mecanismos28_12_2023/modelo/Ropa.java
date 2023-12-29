package javaIO.presentacion.Mecanismos28_12_2023.modelo;

import java.io.Serializable;

public class Ropa implements Serializable {

    //1. atributos
    protected double precio;
    protected String proveedor;
    private int numPrendas;
    //2. metodos
    public String probar(){
        return "La ropa se está probando ....";
    }
    public String desinfectar(){
        return "La ropa se está desinfectando ...";
    }

    public String vender(){
        return "La ropa se está vendiendo ...";
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }
    //3.Constructores



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
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
