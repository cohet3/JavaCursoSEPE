package dataBase1.modelo;

import java.util.List;

public class Factura {
    private IImpuesto impuesto;
    private List<Producto> prodcutos;

    public double calcularTotalFactura(){
        double total= 0;
        for (Producto elemento:
        prodcutos){
            total += elemento.getPrecio()+ impuesto.calcularImpuesto(elemento);
        }
        return total;
    }

    public Factura() {
    }

    public Factura(IImpuesto impuesto, List<Producto> prodcutos) {
        this.impuesto = impuesto;
        this.prodcutos = prodcutos;
    }

    public IImpuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(IImpuesto impuesto) {
        this.impuesto = impuesto;
    }

    public List<Producto> getProdcutos() {
        return prodcutos;
    }

    public void setProdcutos(List<Producto> prodcutos) {
        this.prodcutos = prodcutos;
    }
}
