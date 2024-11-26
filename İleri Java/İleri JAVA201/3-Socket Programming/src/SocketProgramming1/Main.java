package SocketProgramming1;
/*
Socket
    -> Farklı java environmentların birbiriyle haberleşmesini sağlayan yapı
    -> Ağda çalışan 2 programın çift yönlü bağlantıda kalmasını sağlar

 */

public class Main {
    public static void main(String[] args) {

        // Client -> request -> Server
        // Server -> response -> Client

        // Socket Nedir?
        //

        // server port -> iletişim sağlayan kapı
        // Socket severinin socket methodları vardır.
        // public InputStream getInputStream()
        // public OutputStream getOutputStream()
        // public synchronized void close() - socketi kapatır
        // public Socket accept() - bağlantı kabul eder.

        // CLIENT SIDE PROGRAMMING
        // Socket bağlantısını kurma
        // IP adresi - TCP portu sağlama
        // Client ile iletişim
        // Bağlantı kapatma

        // SERVER SIDE PROGRAMMING
        // Socket bağlantısı kurma
        // Client isteğini bekleme
        // Client ile iletişim
        // Bağlantı kapatma


    }
}