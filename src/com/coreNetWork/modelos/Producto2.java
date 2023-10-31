package com.coreNetWork.modelos;

public class Producto2 {
    //1. atributos
    private int idProducto;
    private String nombre;
    private int cantidadExistente;
    //2. metodos
    public void compraProducto(int cantidad){
        if (cantidad>0){
            this.cantidadExistente = this.cantidadExistente+cantidad;
        }
    }
    public void ventaProducto(int cantidad){
        if (cantidad<=this.cantidadExistente)
            this.cantidadExistente = this.cantidadExistente - cantidad;

    }

    @Override
    public String toString() {
        return "PruebaProducto2{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistente=" + cantidadExistente +
                '}';
    }
    //3.constructores

    public Producto2() {
    }

    public Producto2(int idProducto, String nombre, int cantidadExistente) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistente = cantidadExistente;
    }
    //4.getters and setters


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }
}
