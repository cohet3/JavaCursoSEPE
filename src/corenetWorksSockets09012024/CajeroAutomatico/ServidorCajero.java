package corenetWorksSockets09012024.CajeroAutomatico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class ServidorCajero {
    //Servidor
    //1. declarar el BufferedReader
//    2. PrintWriter
//    3. instanciar el server socket
//            4.Bucle Accept()
//        Leer
//    escribir
    private static int saldo=5000;
    public static void main(String[] args) {
        BufferedReader mensajeEntrada = null;
        PrintWriter mensajeSalida = null;
        String [] datos = null;
        try(ServerSocket servidor =new ServerSocket(3000);){
            while (true){
                System.out.printf("Esperando petición ...");
                //aceptamos la peticion
                Socket s1 = servidor.accept();
                mensajeEntrada= new BufferedReader(new InputStreamReader(s1.getInputStream()));
                //Mostrar mensaje recibido
               // System.out.println(mensajeEntrada.readLine());
                //dar formato a los datos
                datos = mensajeEntrada.readLine().split(",");
                double cantidad = Double.parseDouble(datos[2]);

                System.out.println(Arrays.toString(datos));
                mensajeSalida = new PrintWriter(s1.getOutputStream(),true);
                switch (datos[0]){
                    case "1":
                        mensajeSalida.println("su saldo es ->"+saldo);
                        break;
                    case "2": if (saldo >=cantidad){
                        mensajeSalida.println("Su saldo es ->"+(saldo-cantidad));
                        saldo-=cantidad;
                    }else{
                        mensajeSalida.println("Saldo insuficiente ->"+(saldo));
                    }
                    case "3":
                        mensajeSalida.println("Su saldo es ->"+(saldo+cantidad));
                        saldo += cantidad;
                }

            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

}
