package northwindCRUD.modelo;

public class Cliente {

    private String idCliente;
    private String nombreEmpresa;
    private String nombreContacto;

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente='" + idCliente + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", nombreContacto='" + nombreContacto + '\'' +
                '}'+"\n";
    }

    public Cliente() {
    }

    public Cliente(String idCliente, String nombreEmpresa, String nombreContacto) {
        this.idCliente = idCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreContacto = nombreContacto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
}