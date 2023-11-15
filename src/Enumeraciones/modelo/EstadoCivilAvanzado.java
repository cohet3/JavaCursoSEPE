package Enumeraciones.modelo;

public enum EstadoCivilAvanzado {
    CASADO ("Casado"),
    DIVORCIADO("Divorciado"),
    SOLTERO ("Soltero"),
    VIUDO ("Viudo"),
    OTRO ("Otro");
    private final String descripcion;
    private EstadoCivilAvanzado(String descripcion){
        this.descripcion= descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
