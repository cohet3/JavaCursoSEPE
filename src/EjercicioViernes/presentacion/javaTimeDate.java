package EjercicioViernes.presentacion;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class javaTimeDate {
    public static void main(String[] args) {
        // Crear un objeto fecha para el inicio del curso con mes numérico y con la enumeración
        LocalDate inicioCurso = LocalDate.of(2023, Month.JANUARY, 1);
        System.out.println("Fecha de inicio del curso: " + inicioCurso);

        // Crear un objeto fecha para el final del curso
        LocalDate finalCurso = LocalDate.of(2023, Month.JUNE, 30);
        System.out.println("Fecha de final del curso: " + finalCurso);

        // Sumar a la fecha de inicio del curso 5 semanas
        LocalDate inicioCursoMas5Semanas = inicioCurso.plusWeeks(5);
        System.out.println("Fecha de inicio del curso + 5 semanas: " + inicioCursoMas5Semanas);

        // Restar a la fecha de final del curso 80 días
        LocalDate finalCursoMenos80Dias = finalCurso.minusDays(80);
        System.out.println("Fecha de final del curso - 80 días: " + finalCursoMenos80Dias);

        // Crear una fecha del día 100 de este año
        LocalDate dia100 = LocalDate.ofYearDay(2023, 100);
        System.out.println("Fecha del día 100 de este año: " + dia100);

        // Crear la hora del momento en que estás haciendo este ejercicio llamada ahora
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Hora actual: " + ahora);

        // Crear la hora del inicio del curso
        LocalTime horaInicioCurso = LocalTime.of(15, 0);
        System.out.println("Hora de inicio del curso: " + horaInicioCurso);

        // Sumar 5 horas a la hora de inicio de curso
        LocalTime horaInicioCursoMas5Horas = horaInicioCurso.plusHours(5);
        System.out.println("Hora de inicio del curso + 5 horas: " + horaInicioCursoMas5Horas);

        // En 8 semanas será la fecha
        LocalDate fechaEn8Semanas = LocalDate.now().plus(8, ChronoUnit.WEEKS);
        System.out.println("Fecha en 8 semanas: " + fechaEn8Semanas);

        // Hace 8 semanas era la fecha
        LocalDate fechaHace8Semanas = LocalDate.now().minus(8, ChronoUnit.WEEKS);
        System.out.println("Fecha hace 8 semanas: " + fechaHace8Semanas);

        // Sumar a la fecha de inicio de curso 3 días y restarle 2 horas
        LocalDateTime inicioCursoMas3DiasMenos2Horas = inicioCurso.atTime(horaInicioCurso).plusDays(3).minusHours(2);
        System.out.println("Fecha de inicio del curso + 3 días - 2 horas: " + inicioCursoMas3DiasMenos2Horas);

        // Imprimir por la consola si la fecha ahora es antes de la hora de salida
        LocalTime horaSalida = LocalTime.of(18, 0);
        if (LocalDateTime.now().toLocalTime().isBefore(horaSalida)) {
            System.out.println("La hora actual es antes de la hora de salida.");
        } else {
            System.out.println("La hora actual es después de la hora de salida.");
        }

        // Imprimir por la consola si la fecha ahora es después de la hora de entrada
        LocalTime horaEntrada = LocalTime.of(9, 0);
        if (LocalDateTime.now().toLocalTime().isAfter(horaEntrada)) {
            System.out.println("La hora actual es después de la hora de entrada.");
        } else {
            System.out.println("La hora actual es antes de la hora de entrada.");
        }

        // Calcular los años trabajados en una empresa del un empleado que inició a trabajar el 6 de Julio de 2012
        LocalDate fechaInicioTrabajo = LocalDate.of(2012,7,6);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaInicioTrabajo,fechaActual);
        int añosTrabajados = periodo.getYears();
        System.out.println("El empleado ha trabajado " + añosTrabajados + " años");

        // Calcular la edad de una persona que nació el 7 de Agosto de 2007
        LocalDate fechaNacimiento = LocalDate.of(2007, 8, 7);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Edad: " + edad);

        // Se tiene una fecha de fabricación y una fecha de expiración calcular el periodo en el que se puede consumir ese producto
        LocalDate fechaFabricaciion = LocalDate.of(2023,11,17);
        LocalDate fechaCaducidad= LocalDate.of(2024, 2 , 20);
        System.out.println("el producto se puede consumir de: "+fechaFabricaciion +" a "+ fechaCaducidad);
//Declarar la fecha de Navidad y declarar la fecha de Noche Vieja
        LocalDate fechaNavidad = LocalDate.of(2023,12,25);
        LocalDate fechaAñoNuevo= LocalDate.of(2024, 1 , 1);
        System.out.println("navidad: " + fechaNavidad+"año nuevo"+fechaAñoNuevo);
        //Compararlas con los métodos isBefore y isAfter
        System.out.println(fechaNavidad.isBefore(fechaAñoNuevo));
        System.out.println(fechaAñoNuevo.isBefore(fechaNavidad));
        System.out.println(fechaNavidad.isAfter(fechaAñoNuevo));
        System.out.println(fechaAñoNuevo.isAfter(fechaNavidad));

//Con esta matriz de formato {"dd/MM/yyyy",
 /*       "d '('E')' MMM YYYY",
                "w'º semana de ' YYYY",
                "EEEE, dd MMM, YYYY"};
    Aplicarla a la fecha hora actual*/
        LocalDateTime now = LocalDateTime.now();
        String[] formatos = {"dd/MM/yyyy", "d '('E')' MMM YYYY", "w'º semana de ' YYYY", "EEEE, dd MMM, YYYY"};
        for (String formato : formatos) {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
            System.out.println("Diferentes formatos (" + formato + "): " + now.format(formateador));
        }

    }
}