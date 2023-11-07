package ClasesAbstractas.com.coreNetWorkModelo;

public class Vendedor extends Empleado{
    //1.Atributos
    private double ventas;
    private double comision;
    //2 metodos


    @Override
    public String toString() {
        return "Vendedor{" +
                "ventas=" + ventas +
                ", comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public double calcularNomina() {
        return sueldo+ventas*comision;
    }

//3 constructores
    public Vendedor() {
    }

    public Vendedor(double ventas, double comision) {
        this.ventas = ventas;
        this.comision = comision;
    }

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }
    //getters y setters


    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
