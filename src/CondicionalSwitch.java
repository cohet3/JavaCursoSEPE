public class CondicionalSwitch {
    public static void main(String[] args) {

        char estadiCivil = 'S';
        switch (estadiCivil){
            case 'C':
                System.out.println("casado");
                break;
            case 'D':
                System.out.println("divorciado");
                break;
            case 'S':
                System.out.println("soltero");
                break;
            case 'V':
                System.out.println("viudo");
                break;
            default:
                System.out.println("El valor es invalido");
        }
    }
}
