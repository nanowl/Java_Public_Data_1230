package 명함전송클라이언트;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class RcvThread extends Thread{
    private final Socket socket;

    public RcvThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream buf = new DataInputStream(socket.getInputStream());
            String rcvString;
            while (true) {
                rcvString = buf.readUTF(); // 문자열로 읽어 냄 (바이트 단위로 스트림을 자바의 데이터 타입으로 변환)
                System.out.println("서버 : " + rcvString);
            }
        } catch (SocketException e1) {
            System.out.println("상대방의 연결이 종료되었습니다.");
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}

