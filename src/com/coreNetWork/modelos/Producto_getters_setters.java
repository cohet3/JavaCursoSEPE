package com.coreNetWork.modelos;

public class Producto_getters_setters {
    //Atributos
     private int idProducto;
    private String nombre;
    private int cantidadExistencia;
    //Setters
     public void setIdProducto (int valor){
         idProducto= valor;
     }
     public void setNombre(String nombre){
         this.nombre= nombre;
         //this es para referirse al atributo
         }
     public void setCantidadExistencia(int cantidadExistencia){
         this.cantidadExistencia= cantidadExistencia;
     }
     //Getters
     public int getIdProducto(){
         return idProducto;

     }
    public String getNombre(){
        return nombre;

    }
    public int getCantidadExistencia(){
        return cantidadExistencia;

    }

}
