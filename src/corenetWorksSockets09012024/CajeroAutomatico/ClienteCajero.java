package corenetWorksSockets09012024.CajeroAutomatico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCajero {
    //Cliente
/*    1. declaramos el soccket
    2. definir el print writer
    3. Escribir
    4.definir el Buffered Reader
    5. leer la respuesta*/
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        if (solicitarPin()){
        while (true) {
            CuentaBancaria cB1 = solicitarDatos();
            System.out.println(cB1.toString());
            if (cB1.getTipoOperacion() == null) {
                break;
            }
            //String opcionSeleccionada = mostrarMenu();
            try (Socket cliente = new Socket("localhost", 3000)) {
                PrintWriter mensajeAEnviar = new PrintWriter(cliente.getOutputStream(), true);
                mensajeAEnviar.println(cB1.getTipoOperacion() + "," + cB1.getId() + "," + cB1.getCantidad());
                System.out.println("Esperando respuesta del servidor");
                BufferedReader mensajeRecibido = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                System.out.println(mensajeRecibido.readLine());
            } catch (UnknownHostException e) {
                System.out.println(e.toString());
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }}

    private static boolean solicitarPin() {
        int contador = 0;
        String pin = null;

        while (true) {
            System.out.println("Escriba el pin->");
            pin = teclado.nextLine();
            if (pin.equals("1234")) {
                return true;
            } else {
                System.out.println("PIN INCORRECTO");
                contador++;
                if (contador == 3) {
                    System.out.println("Recoge tu targeta en el banco");
                    return false;
                }
            }
        }

    }

    private static CuentaBancaria solicitarDatos() {
        CuentaBancaria sB1 = new CuentaBancaria();
        int tipoOperacion = 0;
                System.out.printf("%s %n", "-".repeat(50));
                System.out.printf("%-20s %n", "MENU BANCARIO");
                System.out.printf("%s %n", "-".repeat(50));
                System.out.printf("%s %n", "1) Consultar Saldo");
                System.out.printf("%s %n", "2) Retirar una cantidad");
                System.out.printf("%s %n", "3) Ingresar una cantidad");
                System.out.printf("%s %n", "4) Salir");
                System.out.printf("Escriba la opción ->");
                tipoOperacion = teclado.nextInt();
                teclado.nextLine();
                if (tipoOperacion == 4) {
                    return sB1;
                }
                System.out.printf("Escribir la cuenta -> ");
                sB1.setId(teclado.nextLine());
                if (tipoOperacion == 2 || tipoOperacion == 3) {
                    System.out.printf("Escribir la cantidad->");
                    sB1.setCantidad(teclado.nextDouble());
                }
                sB1.setTipoOperacion(Integer.toString(tipoOperacion));
                return sB1;
    }

}


