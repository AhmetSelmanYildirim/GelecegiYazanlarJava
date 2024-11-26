package multiclient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int PORT = 5000;

    private static String[] names = {"AHMET","SELMAN","YILDIRIM","AYŞE","MERVE"};
    private static String[] jobs = {"Bilgisayar Muh.","Doktor","Aşçı","Hemşire","Ogretmen"};

    private static ExecutorService pool = Executors.newFixedThreadPool(3); // 3 thread havuzu oluşturur.
    private static ArrayList<ClientHandler> clients = new ArrayList<>();

    public static ArrayList<ClientHandler> getClients() {
        return clients;
    }


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);

        while (true) {
            System.out.println("Waiting for connection...");
            Socket client = serverSocket.accept();
            System.out.println("Accepted connection from " + client.getRemoteSocketAddress());
            // client thread oluşturur
            ClientHandler clientHandler = new ClientHandler(client,clients);
            // client threadi arrayList'e ekler
            clients.add(clientHandler);
            // client ı pool'da aktif eder
            pool.execute(clientHandler);
        }

    }

    public static String randomName(){
        int no = (int) (Math.random()* names.length);
        return names[no]+" "+jobs[no];
    }
}
