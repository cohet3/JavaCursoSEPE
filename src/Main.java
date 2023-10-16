import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //Declarar variable e incrementarla
        int numero = 0;
        numero = numero +1;
        System.out.println(numero);
        numero += 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        int numero2= 100;
        numero2 = numero2 -5;
        System.out.println(numero2);
        numero2 -=5;
        System.out.println(numero2);
        numero2--;
        System.out.println(numero2+ "numero2");

        //MULTIPLICAR
        int numero3 = 7;
        numero3= numero3 * 3;
        System.out.println(numero3);
        numero3 *= 2;
        System.out.println(numero3);

        //division -dividir entre 10 luego entre 5
        int numero4 = 100;
        numero4 = numero4/10;
        System.out.println(numero4);
        numero4 /= 5;
        System.out.println(numero4);

        //Declarar una variable con el nombre numero5 = 8
        //obtener el resto de dividirlo entre 3
        int numero5 =8 ;
        numero5 =numero5 %3;
        System.out.println(numero5);

        //Preincremento
        int num1= 10, num2 = 2, num3=0;
        num3= num1 + ++num2;
        System.out.println(num2);
        System.out.println(num3);
        num2=2;
        num3= num1 + num2++;
        System.out.println(num2);
        System.out.println(num3);
    //operadores de compración
    //declarar una variable con el valor de 10 y decir si es par
    int valor = 10;
        System.out.println("es par "+(valor%2==0));
        System.out.println("es impar "+(valor%2==1));
        // Decir si es multiplo de 10
        System.out.println("es multiplo de 3? "+(valor/3==0));
      //Declarar una variable y asignarle el numero-5
        int valor2= -5;
        //decir si es positivo
        System.out.println("Es positivo?  "+(valor2>=0));
        //decir si es negativo
        System.out.println("¿Es negativo?  " + (valor2<=0));

        //Declarar una variable importe con el valor de 50
        // si importe es igual o menor q 100 un 10% de descuento
        // si el importe es mejor que 100 un 3% de descuento
        float importe = 150F;
        if (importe >= 100 ) {
            System.out.println("entra al if");
            System.out.println(importe * 0.10);
        }else
        {
            System.out.println("entra al else");
            System.out.println(importe * 0.03);
        }
        // decalarar una variable de numero de hijos decir si es familia numerosa
        int hijos = 5;
        if(hijos <=3){
            System.out.println("familia No numerosa  "+ hijos +" HIJOS");
        }else {
            System.out.println("familia numerosa  " + hijos +" HIJOS");
        }
        //una variable edad decir si es mayor de edad o menor
        int edad = 5;
        if(edad <=18){
            System.out.println("No es mayor de edad  "+ edad +" años");
        }else {
            System.out.println("es menor de edad  " + edad +" años");
        }
        // operadores logicos AND=&& y OR = ||

        //declarar una variable para el día del mes, decir los días del mes
        byte mes = 8;
        if (mes==1 ||mes==3 ||mes==5 ||mes==7 ||mes==8 || mes==12){
            System.out.println("tiene 31 días");
        }else {
            System.out.println("tiene 30 días");
        }
        // si el numero esta entre 5 y 15 mostrar que te has ganado un ordeador
        int valorNumerico =8 ;
        if (valorNumerico >= 5 && valorNumerico<=15){
            System.out.println("Usted a ganado un ordenador");
        }else {
            System.out.println("Lo sentimos intente la procima vez");
        }
        //***** día 16 de octubre del 2023 VARIABLES E INSTANCIAS*****
        Scanner tecladoEtrada = new Scanner(System.in);
        System.out.println("escriba su edad");
        int años = 0;
        años =tecladoEtrada.nextInt();
        if (edad<=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("usted es menor de edad");
        }
        System.out.println("El dato leido es ->" + años);
//ejercicios de if


    }
}