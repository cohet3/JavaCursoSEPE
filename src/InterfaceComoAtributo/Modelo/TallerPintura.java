package InterfaceComoAtributo.Modelo;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche se esta pintando "+c.getMatricula()+ " modelo "+ c.getModelo()+
                "El coche ya se pinto";
    }
}
