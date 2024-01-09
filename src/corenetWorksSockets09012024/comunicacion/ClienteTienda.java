package corenetWorksSockets09012024.comunicacion;

import corenetWorksSockets09012024.modelo.TiendaC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Solicitar los datos de las tiendas
        TiendaC t1 = solicitarDatosVenta();
        try {
            // 2. Crear la conexion con el servidor
            Socket peticion = new Socket("localhost", 3000);
            // 3. Escribir en el outputStream
            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(t1.toString());
            // sSalida.flush();
            // 4. Leer que ha llegado las ventas
            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
            System.out.println(bf.readLine());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    private static TiendaC solicitarDatosVenta() {
        Scanner s1 = new Scanner(System.in);
        TiendaC t1 = new TiendaC();
        System.out.print("Escriba el numero de la tienda ->");
        t1.setId(s1.nextInt());
        System.out.print("Escriba el nombre de la tienda ->");
        t1.setNombre(s1.nextLine());
        System.out.print("Escriba las ventas de la tienda ->");
        t1.setVentas(s1.nextDouble());
        return t1;
    }
}
