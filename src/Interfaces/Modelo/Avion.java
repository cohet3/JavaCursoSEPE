package Interfaces.Modelo;

public class Avion implements iObjetoVolador{
    private String color;

    @Override
    public String despegar() {
        return "El ávion esta despegando";
    }

    @Override
    public String volar() {
        return "el ávion esta volando";
    }

    @Override
    public String aterrizar() {
        return "El ávion esta aterrizando";
    }

    public Avion() {
    }

    public Avion(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
