package com.coreNetWork.modelos;

public class Mensaje {
    //atributos
    private String saludo;
    private String ipOrigen;
    private String ipDestino;
    //metodos
   public String mostrarInfo(){
       return " Saludo: "+ saludo+
               " ipOrigen: "+ ipOrigen+
               " ipDestino: "+ipDestino;
   }
   public int calcularNumeroPalabras(String saludo){
     String[] palabras = saludo.split("\\s+");
       return palabras.length;
   }
    //Setters
    public void setSaludo(String saludo){
       this.saludo = saludo;
    }
    public void setIpOrigen(String ipOrigen){
       this.ipOrigen = ipOrigen;
    }
    public void setIpDestino(String ipDestino){
       this.ipDestino= ipDestino;
    }
//Getters
    public String getSaludo(){
       return saludo;
    }
    public String getIpOrigen(){
       return ipOrigen;
    }
    public String getIpDestino(){
       return ipDestino;

    }
}
