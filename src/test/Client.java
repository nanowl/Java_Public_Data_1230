package test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        int port = 3000;
        String serverIP;
        try {
            serverIP = "127.0.0.1";
            Socket socket = new Socket(serverIP, port);
            System.out.println("connect");
        } catch (Exception e) {}
    }
}
