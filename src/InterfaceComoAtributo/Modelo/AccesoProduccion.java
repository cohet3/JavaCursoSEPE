package InterfaceComoAtributo.Modelo;

public class AccesoProduccion implements IDAO {
    @Override
    public String insertar(Cliente c1) {
        return "El cliente ha sido insertado acceso a producción" +c1.getNombre() +"con dni "+c1.getDNI();

    }
}
