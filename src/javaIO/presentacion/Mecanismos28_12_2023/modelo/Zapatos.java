package javaIO.presentacion.Mecanismos28_12_2023.modelo;

public class Zapatos extends Ropa {
    //1 atributos
    private int tamanioTacon;

    //2. metodos
    public String cambiarTacon(){
        return "el tacon se esta reparando";
    }
    //3. constructores

    public Zapatos() {
    }

    public Zapatos(int tamanioTacon) {
        this.tamanioTacon = tamanioTacon;
    }

    public Zapatos(double precio, String proveedor, int numPrendas, int tamanioTacon) {
        super(precio, proveedor, numPrendas);
        this.tamanioTacon = tamanioTacon;
    }

//4. getters y setters

    public int getTamanioTacon() {
        return tamanioTacon;
    }

    public void setTamanioTacon(int tamanioTacon) {
        this.tamanioTacon = tamanioTacon;
    }
}
