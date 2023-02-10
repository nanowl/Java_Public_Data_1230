package 명함전송서버;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
    1. 명함 정보를 담은 클래스 생성
    2. List 생성 후 10명에 대한 명함 정보 입력
    3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
        명함 전송 여부를 물어봄
    4. 클라이언트는 서버에서 전송한 명함 정보를 출력하기
 */
public class NameCardServer {
    public static void main(String[] args) throws IOException {
        int port = 9001;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("waiting....");
            Socket socket = serverSocket.accept();
            System.out.println("connect....");
            RcvThread rcvThread = new RcvThread(socket);
            rcvThread.start();
            SndThread sndThread = new SndThread(socket);
            sndThread.start();
        }
    }


}
