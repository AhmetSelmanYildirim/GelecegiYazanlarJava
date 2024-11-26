package interactiveclientserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT =5001;

    private static String[] names = {"AHMET","SELMAN","YILDIRIM","AYŞE","MERVE"};
    private static String[] jobs = {"Bilgisayar Muh.","Doktor","Aşçı","Hemşire","Ogretmen"};

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started");
        Socket client = serverSocket.accept();
        System.out.println("Server --> Client connected");

        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter output = new PrintWriter(client.getOutputStream(), true);

        while(true) {
            String line = input.readLine();
            if (line.equals("exit")) {
                break;
            }
            output.println(randomName());
        }


        serverSocket.close();
        input.close();
        output.close();

    }

    public static String randomName(){
        int no = (int) (Math.random()* names.length);
        return names[no];
    }

}
