package PreparacionExamen2Ejercicios.switchEjercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
       /* Con una letra que contiene la variable estado decir el estado civil de la persona*/
        char estadoCivil='s';
        switch (estadoCivil){
            case 'S','s':
                System.out.println("esta soltero");
                break;
            case 'C','c':
                System.out.println("Esta casado");
                break;
            case 'D', 'd':
                System.out.println("Esta divorciado");
                break;
            case 'O', 'o':
                System.out.println("estado otro");
                break;
        }
    }
}
