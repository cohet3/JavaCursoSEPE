package javaIO.presentacion.Mecanismos28_12_2023.modelo;

public class Pantalon extends Ropa  {
    //1.Atributos
    private String tipoPantalon;
    //2.metodos
    public String desmontar(){
        return "estamos desmontando el pantalon";
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "tipoPantalon='" + tipoPantalon + '\'' +
                ", precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }

//3.constructores

    public Pantalon() {
    }

    public Pantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    public Pantalon(double precio, String proveedor, int numPrendas, String tipoPantalon) {
        super(precio, proveedor, numPrendas);
        this.tipoPantalon = tipoPantalon;
    }
    //4.getters and setters

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }
}
