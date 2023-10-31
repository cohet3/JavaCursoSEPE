package com.coreNetWork.presentacion;

import com.coreNetWork.modelos.Paciente;

public class PruebaPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
     p1.setIdPaciente(1);
        p1.setNombre("juanito");
        p1.setApellido("alimaña");
        p1.setDni("0000000S");
        p1.setDireccion("calle piruleta");
        p1.setTelefono("666666666");
        p1.setEmail("alimaña@gmail.com");
        System.out.println(p1.toString());
        Paciente p2= new Paciente(2,"Pepito","Lopez","0000001S",
                "calle zarzuela","65455845", "pepito69@gmail.com");
        System.out.println(p2.toString());
    }
}
