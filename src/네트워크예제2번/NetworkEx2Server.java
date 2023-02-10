package 네트워크예제2번;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkEx2Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(); // Generate the Server Socket for Port Binding
            // bind 시 IP와 Port 번호를 입력하는데 대부분
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
            while (true) {
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 요청을 수락함]" +isa.getHostName());
            }
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
