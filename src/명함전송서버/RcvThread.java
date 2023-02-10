package 명함전송서버;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

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
                System.out.println("클라이언트 : " + rcvString);
                if (rcvString.equalsIgnoreCase("y")) {
                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    List<NameCard> nameCards ;
                    nameCards = (List<NameCard>) ois.readObject();
                    nameCards.stream()
                            .forEach(e->
                                    System.out.println("[데이터 받기 성공] : \n" + "이름 : " + e.getName() + "\n"
                                            + "전화번호 : " + e.getPhoneNumber() + "\n"
                                            + "이메일 : " + e.geteMail() + "\n"
                                            + "주소 : " + e.getAddress() + "\n"));
                    ois.close();
                } else if (rcvString.equalsIgnoreCase("n")) {
                    System.out.println("명함을 제공받지 못했습니다.");
                    return;
                }
            }
        } catch (SocketException e1) {
            System.out.println("상대방의 연결이 종료되었습니다.");
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

