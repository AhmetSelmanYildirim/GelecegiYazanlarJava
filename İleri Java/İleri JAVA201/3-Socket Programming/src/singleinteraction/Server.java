package singleinteraction;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    private static final int PORT = 5001;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5001);

        System.out.println("Server started");

        Socket client = serverSocket.accept(); // Bir client bağlanana kadar programı bekletir.
        while (true){
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println((new Date()).toString());
            client = serverSocket.accept();
        }



        //System.out.println("-Server- Tarih bilgisi gönderildi. Bağlantı kapatılıyor");

        //client.close();
        //serverSocket.close();

    }
}
