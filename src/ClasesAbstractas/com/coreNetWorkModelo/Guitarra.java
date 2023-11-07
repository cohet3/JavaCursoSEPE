package ClasesAbstractas.com.coreNetWorkModelo;

public class Guitarra extends IntrumentoMusical{
    private String tiposCuerdas;

    @Override
    public String emitirSonido() {
        return "run run";
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "tiposCuerdas='" + tiposCuerdas + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Guitarra() {
    }

    public Guitarra(String tiposCuerdas) {
        this.tiposCuerdas = tiposCuerdas;
    }

    public Guitarra(String marca, String tiposCuerdas) {
        super(marca);
        this.tiposCuerdas = tiposCuerdas;

    }

    public String getTiposCuerdas() {
        return tiposCuerdas;
    }

    public void setTiposCuerdas(String tiposCuerdas) {
        this.tiposCuerdas = tiposCuerdas;
    }
}
