import java.util.Random;

public class PruebaRandom {
    public static void main(String[] args) {
        //variable de instancia
        Random numeroAleatorio = new Random();
        //mostar numero aleatorio
        System.out.println(numeroAleatorio.nextInt());
        System.out.println(numeroAleatorio.nextInt(50));
        System.out.println(numeroAleatorio.nextInt(1,6));

    }
}
