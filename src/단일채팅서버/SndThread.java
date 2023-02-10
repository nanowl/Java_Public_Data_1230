package 단일채팅서버;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SndThread extends Thread{
    private final Socket socket;
    private Scanner sc = new Scanner(System.in);

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
                sndWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
