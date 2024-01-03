package javaIO.presentacion.corenetworks.modelo;

/*import lombok.Data;

@Data*/
public class Contador {
    //1.Atributos
    public static int contador;
    private int serialNumber;

    public Contador(){
        contador++;
        serialNumber = contador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
