package RepasoNoviembre23.modelo;

import java.util.Objects;

public class Producto implements Comparable {
    private int idProducto;
    private int cantidadExistencia;
    private double precio;

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", cantidadExistencia=" + cantidadExistencia +
                ", precio=" + precio +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto && cantidadExistencia == producto.cantidadExistencia && Double.compare(precio, producto.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, cantidadExistencia, precio);
    }

    public Producto() {
    }

    public Producto(int idProducto, int cantidadExistencia, double precio) {
        this.idProducto = idProducto;
        this.cantidadExistencia = cantidadExistencia;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int compareTo(Object o){
        Producto parametro= null;
        if (o instanceof Producto) {
            parametro=(Producto) o;
        }
            if (cantidadExistencia > parametro.getCantidadExistencia()){
                return 1;
            }else if (cantidadExistencia== parametro.getCantidadExistencia()){
                return 0;
            }else {
                return -1;
            }
        }


}
