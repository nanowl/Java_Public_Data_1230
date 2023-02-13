package 소켓명함다중전송클라이언트;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8900);
            System.out.println("서버 접속 성공");
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 설정 하세요 : ");
            Thread sndTh = new MultiSnd(socket, sc.nextLine());
            Thread rcvTh = new MultiRcv(socket);
            sndTh.start();
            rcvTh.start();
        } catch (Exception e) {
            System.out.println("서버 접속 실패!!!");
        }
    }
}
