package ClasesAbstractas.com.coreNetWorkModelo;

public class Gerente extends Empleado{
    //1 tributos
    private double bono;

    //2 metodos

    @Override
    public String toString() {
        return "Gerente{" +
                "bono=" + bono +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    public Gerente() {
    }

    public Gerente(double bono) {
        this.bono = bono;
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularNomina() {
        return sueldo +bono;

   //3 constructores



        //getters y setters

    }
}
