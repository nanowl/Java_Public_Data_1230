package 명함전송클라이언트;

import 명함전송서버.NameCard;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SndThread extends Thread{
    private final Socket socket;
    static Scanner sc = new Scanner(System.in);
    static List<NameCard> nameCards = new ArrayList<>();
    public SndThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataOutputStream sndWriter = new DataOutputStream(socket.getOutputStream());
            String sndString;
            while (true) {
                sndString = sc.nextLine();
                sndWriter.writeUTF(sndString);
                if (sndString.equalsIgnoreCase("y")) {
                    writeNamCard();
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(nameCards); // 객체를 직렬화해서 파일에 저장
                    oos.flush();
                    oos.close();
                    System.out.println("[데이터 보내기 성공]");
                } else if (sndString.equalsIgnoreCase("n")) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                sndWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void writeNamCard() {
        nameCards.add(
                new NameCard("sam1", "010-1111-2222",
                        "smile1@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam2", "010-1112-2222",
                        "smile2@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam3", "010-1113-2222",
                        "smile3@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam4", "010-1114-2222",
                        "smile4@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam5", "010-1115-2222",
                        "smile5@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam6", "010-1116-2222",
                        "smile6@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam7", "010-1117-2222",
                        "smile7@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam8", "010-1118-2222",
                        "smile8@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam9", "010-1119-2222",
                        "smile9@gmail.com", "San-Andreas"));
        nameCards.add(
                new NameCard("sam10", "010-1110-2222",
                        "smile10@gmail.com", "San-Andreas"));
    }
}
