package corenetWorksSockets09012024.ejercicio1.comunicacion;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMensaje {
    public static void main(String[] args) {
        try {
            //1. Instanciar el ServerSocket
            ServerSocket servidor = new ServerSocket(3000);

            //2. Ponerlo a la escucha
            while (true) {
                System.out.println("En espera de recibir un mensaje...");
                //3. Obtener el socket
                Socket s1 = servidor.accept();
                //4. Leer el Stream
                OutputStream s1out = s1.getOutputStream();
                BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(s1out));

                //5. Escribir la confirmación de recibido
                bw.write("Hello Net World! \n");
               // PrintWriter sRespuesta = new PrintWriter(s1.getOutputStream(),true);
                System.out.println("Se han recibido su mensaje correctamente  -> " );
                bw.close();
                s1.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally{

        }

    }
}
