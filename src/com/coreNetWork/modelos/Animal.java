package com.coreNetWork.modelos;

public class Animal {
    //1.Atributos
    private boolean mamifero;
    private boolean carnivoro;
    private String colorPelaje;
    //2. Métodos
    public String emitirSonido(){
        return "El animal esta emitiendo un sonido ";
    }
    public String comer(){
        return "El animal esta comiendo ";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "mamifero=" + mamifero +
                ", carnivoro=" + carnivoro +
                ", colorPelaje='" + colorPelaje + '\'' +
                '}';
    }
    //3. constructores

    public Animal() {
    }

    public Animal(boolean mamifero, boolean carnivoro, String colorPelaje) {
        this.mamifero = mamifero;
        this.carnivoro = carnivoro;
        this.colorPelaje = colorPelaje;
    }
    //4.Getters y Setters

    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
}
