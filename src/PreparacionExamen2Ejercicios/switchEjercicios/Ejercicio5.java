package PreparacionExamen2Ejercicios.switchEjercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        char letra= 'V';
        switch (letra){
            case 'I','i':
                System.out.println("Uno");
                break;
            case 'V','v':
                System.out.println("Cinco");
                break;
            case 'X', 'x':
                System.out.println("Diez");
                break;
            case 'L', 'l':
                System.out.println("Ciencuenta");
                break;
            case 'C', 'c':
                System.out.println("Cien");
                break;
            case 'D', 'd':
                System.out.println("Cien");
                break;
            case 'M', 'm':
                System.out.println("Mil");
                break;
        }
    }
}
