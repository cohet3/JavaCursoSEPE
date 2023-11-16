package TryCatch.com.coreNetworks.presentacion;

public class Main {
    public static void main(String[] args) {
        int [] enteros = new int[5];
        try {
            enteros[5] = 6;
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Entra en el catch de indexOutBound");
        }
        catch (Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
        }
        System.out.println("despues del try ");
        //Errro típico en los bucles
//        for (int i =0; i<=enteros.length; i++) {
//            enteros[i]=i*5;
//        }

    }
}
