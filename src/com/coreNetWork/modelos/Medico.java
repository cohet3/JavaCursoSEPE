package com.coreNetWork.modelos;

public class Medico {
    //1. Atributos
    private int idMedico;
    private String nombres;
    private String apellidos;
    private String cpm;
    //2. metodos

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cpm='" + cpm + '\'' +
                '}';
    }

    //3.constructores

    public Medico() {
    }

    public Medico(int idMedico, String nombres, String apellidos, String cpm) {
        this.idMedico = idMedico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cpm = cpm;
    }
    //4. getters y setters

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCpm() {
        return cpm;
    }

    public void setCpm(String cpm) {
        this.cpm = cpm;
    }
}
