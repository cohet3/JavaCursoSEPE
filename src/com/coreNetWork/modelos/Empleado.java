package com.coreNetWork.modelos;

public class Empleado {
    //1. atributos
    private int idEmpleado;
    private double sueldo;
    private String dni;
    private double ventas;
    private double porcentajeComision;
    //2. metodos
    //+calcularSueldo():double Sueldo incrementar la comision(ventas por porcentajede comision)
    //+calcularImpuesto(:double ->calcular el sueldo *3
    //3. constructores

    public Empleado() {
    }

    public Empleado(int idEmpleado, double sueldo, String dni, double ventas, double porcentajeComision) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.dni = dni;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }
    //4. getters y setters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}
