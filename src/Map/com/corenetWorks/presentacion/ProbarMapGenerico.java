package Map.com.corenetWorks.presentacion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProbarMapGenerico {
    public static void main(String[] args) {
        Map<Integer ,String> tablaAlumnos= new HashMap<>();
        tablaAlumnos.put(1, "Juan Lopez");
        tablaAlumnos.put(2, "Laura Flores");
        System.out.println(tablaAlumnos);
        System.out.println("Obtener el nombre de la matricula 1->"+tablaAlumnos.get(1));
        System.out.println("Obtener el nombre de la matricula 2->"+tablaAlumnos.get(2));
        System.out.println("obetener todos los alumnos->"+tablaAlumnos.values());
        System.out.println("Mostrar todas la matriculas->"+ tablaAlumnos.keySet());
        System.out.println("Todos los datos en un set->"+tablaAlumnos.entrySet());
        //estructura para alamacenar como un diccionario
        //la palabra puede tener varias definiciones
        Map<String, Set<String>> diccionario= new HashMap<>();
        String palabra= "banco";
        Set<String> definiciones= new HashSet<>();
        definiciones.add("mueble para sentarse");
        definiciones.add("institución para gestionar el money");
        definiciones.add("agrupación de peses");
        diccionario.put(palabra, definiciones);
        System.out.println("Diccionario->"+diccionario);
        String palabra2= "teclado";
        Set<String> definiciones2= new HashSet<>();
        definiciones2.add("instrumento musical");
        definiciones2.add("hadware de un ordenador");
        diccionario.put(palabra2, definiciones2);
        System.out.println("diccionario con teclado"+diccionario);

    }
}
