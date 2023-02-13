package 소켓명함다중전송서버;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiChatThread extends Thread{
    // 소켓 식별자로 어레이리스트 생성
    Socket socket;
    Scanner sc ;
    static List<Socket> sockets = new ArrayList<>();
    static List<NameCard> nameCards = new ArrayList<>();
    public MultiChatThread(Socket socket) {
        sc = new Scanner(System.in);
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            while(true) {
                System.out.print("클라이언트에게 명함을 보내시겠습니까? (y/n) : ");
                String str;
                // 소켓으로 부터 입력을 받음 (바이트 단위)
                InputStream input = socket.getInputStream();
                // 문자 변환 보조 스트림 (바이트 입력을 문자로 변환)
                InputStreamReader isr = new InputStreamReader(input);
                // 버퍼를 이용이용하면 입/출력 성능이 개선 됨 (성능향상보조스트림)
                BufferedReader reader = new BufferedReader(isr);
                if ((str = reader.readLine()).equalsIgnoreCase("y")) {
                    System.out.println(str);
                    ObjectOutputStream out = null;
                    for (int i = 0; i < sockets.size(); i++) {
                        out = new ObjectOutputStream(sockets.get(i).getOutputStream());
                        out.writeObject(nameCards);
                        PrintWriter writer = new PrintWriter(out, true);
                        writer.println(str);
                    }
                    out.flush();
                    out.close();
                }
            }

        } catch (IOException e) {}
    }
}
