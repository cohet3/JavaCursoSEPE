package ClasesAbstractas.com.coreNetWorkModelo;

public class Flauta extends IntrumentoMusical{
    private String material;
    @Override
    public String emitirSonido() {
        return "flu flu";
    }

    @Override
    public String toString() {
        return "Flauta{" +
                "material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Flauta() {
    }

    public Flauta(String material) {
        this.material = material;
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
