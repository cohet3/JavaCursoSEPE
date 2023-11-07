package ClasesAbstractas.com.coreNetWorkModelo;

public class Rectangulo extends Figura{
    //atributos
    private int base;
    private int altura;

    @Override
    public double calcularArea() {
        return base*altura;
    }
    //metodos

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
//constructores
    public Rectangulo() {
    }

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    //getters y setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
