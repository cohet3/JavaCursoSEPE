import java.util.Scanner;

public class Ejercicio3Switch {
    public static void main(String[] args) {
        // 3. pedir el dia , mes y año de una fecha e indicar si la fecha es correcta con meses de 28 dias 30 y 31 dias. sin años bisiestos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = sc.nextInt();

        boolean fechaValida = false;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia >= 1 && dia <= 31) {
                    fechaValida = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia >= 1 && dia <= 30) {
                    fechaValida = true;
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 28) {
                    fechaValida = true;
                }
                break;
            default:
                System.out.println("El mes ingresado no es válido.");
                break;
        }

        if (fechaValida) {
            System.out.println("La fecha ingresada es válida  " +dia +"-" + mes + "-" + anio);
        } else {
            System.out.println("La fecha ingresada no es válida  "+dia +"-" + mes + "-" + anio  );
        }
    }
}
