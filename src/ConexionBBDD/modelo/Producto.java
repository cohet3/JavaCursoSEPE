package ConexionBBDD.modelo;

import java.util.Objects;

public class Producto {
    private int product_id;
    private int product_name;
    private int unit_price;
    private int units_in_stock;
    private int quantity_per_unit;



    @Override
    public String toString() {
        return "Producto{" +
                "product_id=" + product_id +
                ", product_name=" + product_name +
                ", unit_price=" + unit_price +
                ", units_in_stock=" + units_in_stock +
                ", quantity_per_unit=" + quantity_per_unit +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return product_id == producto.product_id && product_name == producto.product_name && unit_price == producto.unit_price && units_in_stock == producto.units_in_stock && quantity_per_unit == producto.quantity_per_unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name, unit_price, units_in_stock, quantity_per_unit);
    }

    public Producto(int productId, String productName, double unitPrice, int unitsInStock) {
    }

    public Producto(int product_id, int product_name, int unit_price, int units_in_stock, int quantity_per_unit) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.unit_price = unit_price;
        this.units_in_stock = units_in_stock;
        this.quantity_per_unit = quantity_per_unit;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_name() {
        return product_name;
    }

    public void setProduct_name(int product_name) {
        this.product_name = product_name;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public int getUnits_in_stock() {
        return units_in_stock;
    }

    public void setUnits_in_stock(int units_in_stock) {
        this.units_in_stock = units_in_stock;
    }

    public int getQuantity_per_unit() {
        return quantity_per_unit;
    }

    public void setQuantity_per_unit(int quantity_per_unit) {
        this.quantity_per_unit = quantity_per_unit;
    }
}
