package 단일채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {
    public static void main(String[] args) throws IOException {
        int port = 7777;
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("IP : " + socket.getInetAddress() + " 와 연결되었습니다.");
            RcvThread rcvThread = new RcvThread(socket);
            rcvThread.start();
            SndThread sndThread = new SndThread(socket);
            sndThread.start();
        }


    }
}
