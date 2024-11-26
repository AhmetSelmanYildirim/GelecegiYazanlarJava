package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;


public class ClientHandler implements Runnable {
    private static final int SERVER_PORT =5000;
    private static final String IP_ADDRESS ="127.0.0.1";

    private Socket clientSocket;
    private PrintWriter output;
    private BufferedReader input;
    private static ArrayList<ClientHandler> clients;

    public ClientHandler(Socket clientSocket, ArrayList<ClientHandler> clients) throws IOException {
        this.clientSocket = clientSocket;
        this.clients = clients;
        this.input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));;
        this.output = new PrintWriter(clientSocket.getOutputStream(),true);;
    }

    @Override
    public void run() {
        try{
            while(true){
                String request = input.readLine();
                if(request.contains("birisi")){
                    output.println(Server.randomName());
                }else if(request.startsWith("[herkes] ")){
                    int firstSpace = request.indexOf(" ");
                    if(firstSpace != -1){
                        // bütün kullanıcılara mesaj yolla
                        sendAllMessage(request.substring(firstSpace+1));
                    }
                }else if(request.equals("exit")){
                    output.println("Bye");
                    break;
                }else{
                    output.println("Rastgele bir kişi için \"birisi\" yazınız.");
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            output.close();
            try {
                input.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private  void sendAllMessage(String message){
        for(ClientHandler tempClient : clients){
            tempClient.output.println(Thread.currentThread().getName()+": "+message);
        }
    }


}
