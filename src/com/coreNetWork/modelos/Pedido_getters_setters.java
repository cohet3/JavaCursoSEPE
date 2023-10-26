package com.coreNetWork.modelos;

public class Pedido_getters_setters {

   //atributos
   private int idPedido;
    private double importe;
    private char formaPago;
    //metodos
    public double calcularIva(double porcentaje){
        return importe*porcentaje;
    }
    public String mostrarInfo(){
        return "Id pedido : "+ idPedido+
                " Importe : "+ importe +
                " Forma de pago : "+ formaPago;
    }

    //setters
    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }

    public void setImporte(double importe){
        this.importe= importe;
    }
    public void setFormaPago(char formaPago){
        this.formaPago= formaPago;
    }
    //getters

    public int getIdPedido(){
        return idPedido;
    }
    public double getImporte(){
        return importe;
    }
    public char getFormaPago(){
        return formaPago;
    }

}
