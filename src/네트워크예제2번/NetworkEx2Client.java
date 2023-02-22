package 네트워크예제2번;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetworkEx2Client {
    public static void main(String[] args) {
        Socket socket = null;
        String serverIP;
        try {
            serverIP = InetAddress.getLocalHost().getHostAddress();
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");
            System.out.println(serverIP);
        } catch (Exception e) {}
        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {}
        }
    }
}
