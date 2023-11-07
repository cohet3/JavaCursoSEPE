package ClasesAbstractas.com.coreNetWorkModelo;

public class Bateria extends IntrumentoMusical{
    private int noPlatillos;
    @Override
    public String emitirSonido() {
        return "plas plas";
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatillos=" + noPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Bateria() {
    }

    public Bateria(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}
