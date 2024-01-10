package corenetWorksSockets09012024.CajeroAutomatico;

import java.util.Objects;

public class CuentaBancaria {
    private String id;
    private String tipoOperacion;
    private double cantidad;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String id, String tipoOperacion, double cantidad) {
        this.id = id;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Double.compare(cantidad, that.cantidad) == 0 && Objects.equals(id, that.id) && Objects.equals(tipoOperacion, that.tipoOperacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoOperacion, cantidad);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id='" + id + '\'' +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
