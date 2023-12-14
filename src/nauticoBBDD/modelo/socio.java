package nauticoBBDD.modelo;

import java.util.Objects;

public class socio {
    private String carnet;
    private String dni;

    @Override
    public String toString() {
        return "socio{" +
                "carnet='" + carnet + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        socio socio = (socio) o;
        return Objects.equals(carnet, socio.carnet) && Objects.equals(dni, socio.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carnet, dni);
    }

    public socio() {
    }

    public socio(String carnet, String dni) {
        this.carnet = carnet;
        this.dni = dni;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
