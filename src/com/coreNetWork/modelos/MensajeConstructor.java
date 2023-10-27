package com.coreNetWork.modelos;

public class MensajeConstructor {
    private String saludo;
    private String ipOrigen;
    private String ipDestino;

    public void Mensaje(String saludo, String ipOrigen, String ipDestino){
        this.saludo= saludo;
        this.ipOrigen= ipOrigen;
        this.ipDestino= ipDestino;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }
}
