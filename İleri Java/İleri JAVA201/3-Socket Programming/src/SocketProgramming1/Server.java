package SocketProgramming1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;

    public Server(int port) throws IOException {

        serverSocket = new ServerSocket(port);
        System.out.println("Server started at port: " + port);

        System.out.println("Waiting for connection...");

        socket = serverSocket.accept();
        System.out.println("Connection accepted");

        // İstemci soketinden girdi alınıyor.
        dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        String text = "";
        while(!text.equals("exit")) {
            text = dataInputStream.readUTF();
            System.out.println(text);
        }

        System.out.println("Server stopped");
        dataInputStream.close();
        socket.close();

    }

    public static void main(String[] args) throws IOException {

        Server server = new Server(5000);

    }
}
