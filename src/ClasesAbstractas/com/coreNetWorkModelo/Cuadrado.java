package ClasesAbstractas.com.coreNetWorkModelo;

public class Cuadrado extends Figura{
    //1.atributos
    private double lado;
    //2.metodos

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    //3.constructores

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    //4. Getters y setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
