package Poo;

public class TablasDeMultiplicar {
    //1. Atributos
    private int tabla;

    //2. metodos
    public String tablaMultiplicar(){
        String resultado = "";
        for (int i = 1; i<=10; i++){
           resultado += tabla + " * "+ i + " = " +tabla*i + "\n";
        }
        return resultado;
    }
    //3. Constructores
    //siempre hacer uno vacio y otro completo
    public TablasDeMultiplicar() {
    }

    public TablasDeMultiplicar(int tabla) {
        this.tabla = tabla;
    }
    //4.Setters y Getters


    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }
}
