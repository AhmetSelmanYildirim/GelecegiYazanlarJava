package multiclient;

import java.io.*;
import java.net.Socket;

public class Client {

    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 5000;


    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(SERVER_IP,SERVER_PORT);

        ServerConnection serverConnection = new ServerConnection(socket);

        BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        new Thread(serverConnection).start();

        while (true) {
            System.out.println("[CLIENT]: ");
            String command = keyboardInput.readLine();
            out.println(command);

            if (command.equals("exit")) {
                break;
            }
        }

        socket.close();
        System.exit(0);

    }


}
