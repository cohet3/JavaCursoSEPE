package InterfaceComoAtributo.Modelo;

public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "El cliente "+ c1.getNombre()+ " con dni " +c1.getDNI()+" Accedio a desarrollo";
    }
}
