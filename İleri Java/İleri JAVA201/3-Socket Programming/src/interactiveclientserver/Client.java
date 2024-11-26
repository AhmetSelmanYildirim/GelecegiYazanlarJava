package interactiveclientserver;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 5001;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP,SERVER_PORT);
        BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream())); // sunucu üzerinden veri almak

        BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in)); // Terminal üzerinden veri almak

        PrintWriter output = new PrintWriter(socket.getOutputStream(), true); // Gelen veriyi output nesnesine vermek

        while (true) {
            System.out.println("Client --> ");
            String command = keyboardInput.readLine(); // klavyeden gelen veri
            output.println(command); // server a gönderiliyor
            String response = socketInput.readLine(); // server cevabı response stringinde tutuluyor
            System.out.println("Server response --> " + response);
            if(command.equals("exit")) {
                break;
            }
        }

        socket.close();
        System.exit(0);

    }
}
