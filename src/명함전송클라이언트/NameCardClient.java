package 명함전송클라이언트;

import 명함전송서버.NameCard;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.rmi.UnexpectedException;


/*
    1. 명함 정보를 담은 클래스 생성
    2. List 생성 후 10명에 대한 명함 정보 입력
    3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
        명함 전송 여부를 물어봄
    4. 클라이언트는 서버에서 전송한 명함 정보를 출력하기
 */
public class NameCardClient {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 9001);
            System.out.println("서버와 연결되었습니다.");
        }catch (ConnectException e) {
            System.out.println("서버의 연결이 거절 되었습니다. 서버를 먼저 실행하세요.");
        } catch (UnexpectedException e) {
            System.out.println("서버를 알 수 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (socket != null) {
            RcvThread rcvThread = new RcvThread(socket);
            rcvThread.start();
            SndThread sndThread = new SndThread(socket);
            sndThread.start();
        }
    }
}
