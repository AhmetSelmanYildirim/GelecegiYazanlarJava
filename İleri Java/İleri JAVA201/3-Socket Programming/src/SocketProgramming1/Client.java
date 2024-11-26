package SocketProgramming1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    // Initialize socket. Socket, input, output
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public Client(String address, int port)  {
        try {
            // Bağlantı kurmak
            socket = new Socket(address,port);
            System.out.println("Client sunucuya bağlandı.");

            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());

            // İstemci ile iletişim
            String text = "";
            while(!text.equals("exit")) {
                text = input.readLine();
                output.writeUTF(text);
            }

            // Bağlantı kapatma
            input.close();
            output.close();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        Client client = new Client("127.0.0.1",5000);


    }
}
