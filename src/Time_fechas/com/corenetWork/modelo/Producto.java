package Time_fechas.com.corenetWork.modelo;

public /*final*/ class Producto {
    private final int idProducto;
    private double precio;

    public final double iva(){
     return precio* 0.21;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto && Double.compare(precio, producto.precio) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }



    public Producto(int idProducto, double precio) {
        this.idProducto = idProducto;
        this.precio = precio;
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
