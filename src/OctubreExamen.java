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

    }
}
