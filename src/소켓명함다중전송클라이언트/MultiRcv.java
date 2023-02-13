package 소켓명함다중전송클라이언트;

import 소켓명함다중전송서버.NameCard;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class MultiRcv extends Thread{
    Socket socket;
    public MultiRcv(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        InputStream input;     // 바이너리 입력
        InputStreamReader isr; // 바이너리를 문자로 변환하는 스트림
        BufferedReader reader; // 성능 향상 보조 스트림
        try {
            while (true) {
                DataInputStream buf = new DataInputStream(socket.getInputStream());
                String rcvString;
                isr = new InputStreamReader(buf);
                reader = new BufferedReader(isr);
                if ((rcvString = reader.readLine()).equalsIgnoreCase("y")) {
                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    List<NameCard> nameCards;
                    nameCards = (List<NameCard>) ois.readObject();
                    nameCards.stream()
                            .forEach(e ->
                                    System.out.println("[데이터 받기 성공] : \n" + "이름 : " + e.getName() + "\n"
                                            + "전화번호 : " + e.getPhoneNumber() + "\n"
                                            + "이메일 : " + e.getEmail() + "\n"
                                            + "주소 : " + e.getAddress() + "\n"));
                    ois.close();
                } else if (rcvString.equalsIgnoreCase("n")) {
                    System.out.println("명함을 제공받지 못했습니다.");
                    return;
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
