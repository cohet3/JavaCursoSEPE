package com.coreNetWork.modelos;

public class Proyecto {
    //1.atributos
    private int idProyecto;
    private String nombreProyecto;
    private double horas;
    private double tarifa;

//2.metodos
    //+calcularImporte(): double -(horas *tarifa)
    public double calcularImporte(){
        return horas*tarifa;
    }
    //+calcularImporte(descuento : double: double -(horas*tarifa)
    public double calcularDescuento(double descuento){
        descuento= calcularImporte()-(calcularImporte()*descuento);
        return descuento;
    }
    //tostring

    @Override
    public String toString() {
        return "Proyecto{" +
                "idProyecto=" + idProyecto +
                ", nombreProyecto='" + nombreProyecto + '\'' +
                ", horas=" + horas +
                ", tarifa=" + tarifa +
                '}';
    }

    //3.constructores

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto, double horas, double tarifa) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    //4. getters y setters

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
