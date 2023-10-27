package com.coreNetWork.modelos;

public class Campos {
    //atributos
    private int x;
    //methodos uno muestra y otro incrementa


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int incrementa(){
    return x++;
}
    public int muestra (){
    return incrementa();
}

}
