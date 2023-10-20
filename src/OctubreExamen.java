import java.util.Scanner;

public class OctubreExamen {
    public static void main(String[] args) {
        //Examen octubre
        //1 . Crear un proyecto en intelegent
        //2. Crear el repositorio Git Hub
        // 3. Hay que declarar 3 variables una entera con el nombre de edad= 18, otra doble con el nombre de sueldo=1200 y una char con sexo='m'
        int edad = 18;
        double sueldo = 1200;
        char sexo = 'M';
        System.out.println("Edad= "+edad+" años");
        System.out.println("Sueldo= "+ sueldo +" €");
        System.out.println("Sexo "+sexo);

        //4. Definir 2 variables una de apellido con el valor "Ruiz" y la otra con el valor verdadero
        String apellido=  "Ruiz";
        boolean verdadero = true;
        System.out.println("el apellido es " + apellido);
        System.out.println(verdadero);
        // 5. Definir una variable númerica para guardar la hora, escribir por la consola buenos dias
        // si la hora esta entre 0 y 12 y en el resto de los casos buenas noches
        //primitivas
        int hora = 6;
        //instancia
     if (hora <=12){
         System.out.println("buenos días");
     }else {
         System.out.println("buenas noches");
     }
    //6 solicitar por consola el precio de un producto y mostrarlo en la consola. Definir una variable de tipo double con el nombre de precio
        // declaro variables
        //primitivas
        double precio = 0;
     // instancia
        Scanner sr = new Scanner(System.in);
        System.out.println("introduce el precio");
//        precio = sr.nextDouble(); esta comentado para que no solicite entrada por consola
        System.out.println("el precio es = "+precio+ " €");
        // mostrar en la consola del 10 al 0
        for (int i = 10; i >=0; i--){
            System.out.println(i);
        }
        // solicitar por consola el DNI, nombre y dirección mostrar en la consola el texto
        //declaracion de variables
        //primitivas
        String dni = "";
        String nombre = "";
        String direccion = "";
        //Instancia (la clase scanner esta en la linea 36)
        System.out.println("introduce tu DNI");
        dni = sr.nextLine();
        System.out.println("introduce tu nombre");
        nombre = sr.nextLine();
        System.out.println("introduce tu dirección");
        direccion= sr.nextLine();
        System.out.println(" nombre: "+ nombre + " DNI: "+ dni+ " Dirección: "+ direccion);

    }
}
