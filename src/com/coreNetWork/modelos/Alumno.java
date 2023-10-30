package com.coreNetWork.modelos;

public class Alumno {
    //1 Atributos
    private String nombreAlumno;
    private double [] notas;
    //2. Metodos
    public void asignarValores(double nota, int posicion){
        notas[posicion]=nota;
    }
    public double promedio(){
        //1. Declaracion de variables
        double suma= 0;
        //2. Estructuras
        for (int i =0; i <notas.length ; i++){
            suma = suma + notas[i];
            //suma += notas[i]
        }
       return suma/notas.length;
    }
public String mostrar(){
        //1.Declarar variables
    String resultado= "";
    //2.Estructura
    for (int i = 0; i< notas.length; i++){
        resultado = resultado + notas[i] +", ";
    }
    return resultado;
}
    //3. Constructores lo hemos construido antes que los métodos en vacio
    // y lo hemos personalizado según lo necesitamos para resolver los problemas

    public Alumno(String nombre, int numParciales) {
        nombreAlumno= nombre;
        notas= new double[numParciales];
    }

    //4 Getters y setters


    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
