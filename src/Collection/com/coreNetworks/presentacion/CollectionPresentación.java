package Collection.com.coreNetworks.presentacion;

import Collection.com.coreNetworks.modelo.Empleado;

import java.util.HashSet;
import java.util.Set;

public class CollectionPresentación {
    public static void main(String[] args) {
        //Probar la interface Set
        HashSet conjunto = new HashSet();//Sin usar polimorfismo
        Set conjunto1 = new HashSet();//Recomendable utilizar poliformismo
        System.out.println("esta vacio ? "+conjunto1.isEmpty());
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1);
        conjunto1.add("perro");
        System.out.println(conjunto1);

        System.out.println("La colección contiene el elemento casa "+conjunto1.contains("casa"));
        System.out.println("numero de elementos ->"+conjunto1.size());
        conjunto1.add("carro");
        conjunto1.add("piscina");
        System.out.println(conjunto1);
        //No acepta repetidos y no respeta el orden de entrada de datos
        conjunto1.add(5);
        System.out.println(conjunto1);
        Empleado e1= new Empleado(1);
        conjunto1.add(e1);
        System.out.println(conjunto1);
        System.out.println(conjunto1.remove(e1));
        System.out.println(conjunto1);
        for (Object elemento: conjunto1){
            System.out.println(elemento.toString());
        }

      /*  for (int i= 0; i< conjunto1.size(); i++){
            System.out.println(conjunto1.toString());
        }   NO HAY FORMA DE RECORRERLO CON UN FOR*/


    }
}
