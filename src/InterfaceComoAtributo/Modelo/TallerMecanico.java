package InterfaceComoAtributo.Modelo;

public class TallerMecanico implements ITaller {

    @Override
    public String reparar(Coche c) {
        return "El coche se esta reparando  "+c.getMatricula()+ " modelo  "+ c.getModelo()+
                "el coche ya se reparo";
    }
}
