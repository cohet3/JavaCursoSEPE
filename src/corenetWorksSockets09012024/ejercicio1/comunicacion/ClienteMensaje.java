package corenetWorksSockets09012024.ejercicio1.comunicacion;

import java.io.*;
import java.net.Socket;

public class ClienteMensaje {
    public static void main(String[] args) {
/*        Scanner s1 = new Scanner(System.in);
        String mensaje =s1.nextLine();*/
        try {
            // 2. Abrimos una conexion al aservidor en el puerto 3000
            Socket s1 = new Socket("localhost", 3000);
            // 3. generamos un input stream desde el socket
            InputStream is = s1.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));
            // leemos el mensaje enviado por el servidor y lo mostramos
            System.out.println(bf.readLine());
            // 4. cerramos los recursos abiertos
            bf.close();
            s1.close();

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    }

