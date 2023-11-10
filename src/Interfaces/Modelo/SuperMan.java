package Interfaces.Modelo;

public class SuperMan implements iObjetoVolador{
    @Override
    public String despegar() {
        return "Superman despega";
    }

    @Override
    public String volar() {
        return "Superman Vuela";
    }

    @Override
    public String aterrizar() {
        return "Superman aterriza";
    }
    public String pararBala(){
        return "Superman Para la bala";
    }
    public String saltarEdificio(){
        return "superman esta saltando la ciudad";
    }

    @Override
    public String toString() {
        return "SuperMan{}";
    }

}
