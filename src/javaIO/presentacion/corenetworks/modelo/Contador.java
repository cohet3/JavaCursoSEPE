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
}
