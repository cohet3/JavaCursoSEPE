package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Medico;

public class PruebaMedico {
    public static void main(String[] args) {
        Medico m1 = new Medico();
        m1.setIdMedico(1);
        m1.setNombres("house");
        m1.setApellidos("Speciality");
        m1.setCpm("2334");
        System.out.println(m1.toString());
        Medico m2 = new Medico(2,"Pepito","chistoso", "2345");
        System.out.println(m2.toString());
    }
}
