package Interfaces.Modelo;

public class Barcaza implements iNautico{
    @Override
    public String navegar() {
        return "La barcaza esta navegando";
    }

    @Override
    public String atracar() {
        return "La barcaza esta atracando";
    }

    @Override
    public String toString() {
        return "Barcaza{}";
    }
}
