package 소켓명함다중전송서버;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiChatServer {
    static List<NameCard> nameCards = new ArrayList<>();
    public static void main(String[] args) {
        int port = 8990;
        try {
            // port 번호만 넣으면 서버의 첫번째 ip가 자동 입력
            // 바인딩 과정 생략
            ServerSocket serverSocket = new ServerSocket(port);
            Scanner sc = new Scanner(System.in);
            while(true) {
                // 하나의 session, 즉 한개의 연결 통로가 만들어 짐
                Socket socket = serverSocket.accept();
                System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress()+" ]");
                System.out.print("명함을 제공하시겠습니까? (yes/no) : ");
                String confirm = sc.next();
                if (confirm.equalsIgnoreCase("yes")) {
                    Thread serverTh = new NameServerTh(socket);
                    serverTh.start();
                }
            }

        } catch(IOException e) {}
    }
    static List<NameCard> writeNamCard() {
        nameCards.add(
                new NameCard("sam1", "010-1111-2222",
                        "smile1@gmail.com", "San-Andreas1"));
        nameCards.add(
                new NameCard("sam2", "010-1112-2222",
                        "smile2@gmail.com", "San-Andreas2"));
        nameCards.add(
                new NameCard("sam3", "010-1113-2222",
                        "smile3@gmail.com", "San-Andreas3"));
        nameCards.add(
                new NameCard("sam4", "010-1114-2222",
                        "smile4@gmail.com", "San-Andreas4"));
        nameCards.add(
                new NameCard("sam5", "010-1115-2222",
                        "smile5@gmail.com", "San-Andreas5"));
        nameCards.add(
                new NameCard("sam6", "010-1116-2222",
                        "smile6@gmail.com", "San-Andreas6"));
        nameCards.add(
                new NameCard("sam7", "010-1117-2222",
                        "smile7@gmail.com", "San-Andreas7"));
        nameCards.add(
                new NameCard("sam8", "010-1118-2222",
                        "smile8@gmail.com", "San-Andreas8"));
        nameCards.add(
                new NameCard("sam9", "010-1119-2222",
                        "smile9@gmail.com", "San-Andreas9"));
        nameCards.add(
                new NameCard("sam10", "010-1110-2222",
                        "smile10@gmail.com", "San-Andreas10"));
        return nameCards;
    }
}

class NameServerTh extends Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;

    public NameServerTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < sockets.size(); i++) {
                OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(MultiChatServer.writeNamCard());
                oos.flush();
                oos.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
                os.close();
            }
        } catch (IOException e) {}
    }
}
