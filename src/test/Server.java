package test;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 3000;

        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("connect" + client.getRemoteSocketAddress() );
            }
        } catch (Exception e) {}
    }
}
