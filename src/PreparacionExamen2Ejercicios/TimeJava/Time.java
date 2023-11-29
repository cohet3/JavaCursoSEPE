package PreparacionExamen2Ejercicios.TimeJava;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[] args) {

        //Calcular la edad de una persona que nació el 3 de septiembre 1998
        LocalDate fechaNacimiento = LocalDate.of(1998, 9, 3);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Edad: " + edad.getYears());

        //Calcular la fecha de mañana
        LocalDate fechaDeMañana = LocalDate.now().plus(1, ChronoUnit.DAYS);
        System.out.println("Fecha de mañana: " + fechaDeMañana);

        //Restar 3 meses a la fecha de final de curso 22 de marzo de 2024
        LocalDate finalCurso2 = LocalDate.of(2024, Month.MARCH, 15);
        LocalDate finalCursoMenos3meses = finalCurso2.minusMonths(3);
        System.out.println("Fecha de final del curso - 3 meses: " + finalCursoMenos3meses);

        //Calcular los dias desde el inicio del curso
        Period diasEstudiados = Period.between(LocalDate.of(2023,10,9),LocalDate.now());
        System.out.println(diasEstudiados.getDays());
        long diasTranscurridos = ChronoUnit.DAYS.between(LocalDate.of(2023,10,9), LocalDate.now());
        System.out.println("Dias transcurridos "+diasTranscurridos);

        //Duración del curso
        System.out.println(Period.between(LocalDate.of(2024,3,15),LocalDate.of(2023,10,9)));


    }
}

