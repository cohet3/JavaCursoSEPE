package com.coreNetWork.modelos;

public class Especialidad {
    //1.atributos
    private String nombre;
    private int idEspecialidad;
    //2. metodos

    @Override
    public String toString() {
        return "Especialidad{" +
                "nombre='" + nombre + '\'' +
                ", idEspecialidad=" + idEspecialidad +
                '}';
    }

    //3.constructores

    public Especialidad() {
    }

    public Especialidad(String nombre, int idEspecialidad) {
        this.nombre = nombre;
        this.idEspecialidad = idEspecialidad;
    }
    //4.getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
}
