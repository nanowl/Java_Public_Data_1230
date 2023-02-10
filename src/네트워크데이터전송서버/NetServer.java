package 네트워크데이터전송서버;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5001));

            System.out.println( "[연결 기다림]");
            Socket socket = serverSocket.accept();
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[연결 수락함] " + isa.getHostName());

            byte[] bytes = null;
            String msg = null;

        } catch(Exception e) {}

        if(!serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch (IOException e1) {}
        }
    }
}
