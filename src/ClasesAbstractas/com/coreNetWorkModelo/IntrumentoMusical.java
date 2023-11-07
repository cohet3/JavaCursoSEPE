package ClasesAbstractas.com.coreNetWorkModelo;

public abstract class IntrumentoMusical {
    //atributos
    protected String marca;
    //metodos
    public abstract String emitirSonido();
    //constructores

    public IntrumentoMusical() {
    }

    public IntrumentoMusical(String marca) {
        this.marca = marca;
    }
    //getters y setter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
