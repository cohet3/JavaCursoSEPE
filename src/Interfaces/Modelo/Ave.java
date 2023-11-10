package Interfaces.Modelo;

public class Ave implements iObjetoVolador {

    @Override
    public String despegar() {
        return "el ave esta despegando";
    }

    @Override
    public String volar() {
        return "el ave esta volando";
    }

    @Override
    public String aterrizar() {
        return "el ave esta aterrizando";
    }
    public String hacerNido(){
        return "el ave esta haciendo un nido";
    }
    public String ponerHuevo(){
        return "El ave esta poniendo huevo...";
    }

    @Override
    public String toString() {
        return "Ave{}";
    }
}
