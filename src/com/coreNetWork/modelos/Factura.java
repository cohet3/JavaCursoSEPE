package com.coreNetWork.modelos;

public class Factura {
    //Crear la calse factura tener un id (entero) , importe, dirreccionEntrega, cliente

    public int Id;
    public double Importe;
    public  String DirecciónEntrega;
    public  String Cliente;
    public double CalcularIVA(){
        return Importe * 0.21;
    };
    public double CalcularIVA(double porcentace){
        return Importe* porcentace;
    }
}
