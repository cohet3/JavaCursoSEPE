package com.coreNetWork.modelos;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String telefono;
    private  int numeroEmpleados;
    //setters
    public void setIdProveedor (int valor){
        idProveedor= valor;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
        //this es para referirse al atributo
    }
    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public void setNumeroEmpleados(int numeroEmpleados){
        this.numeroEmpleados=numeroEmpleados;
    }
        //getters

    public int getIdProveedor(){
            return idProveedor;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public int getNumeroEmpleados(){
        return numeroEmpleados;
    }
}
