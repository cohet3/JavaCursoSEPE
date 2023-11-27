package PreparacionExamen2Ejercicios.Ejercicio3.modelo;

public class Persona {
    //1. Atributos
    private int edad;
    //2. metodos


    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public int calcularEdadEnDias() {
        return edad * 365;
    }

    public long calcularEdadEnSegundos() {
        return edad * 365 * 24L * 60L * 60L;
    }

    //3. constructores

    public Persona() {
    }

    //4.setters y guetters


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
