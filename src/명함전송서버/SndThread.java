package 명함전송서버;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SndThread extends Thread{
    private final Socket socket;
//    private Scanner sc = new Scanner(System.in);

    public SndThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataOutputStream sndWriter = new DataOutputStream(socket.getOutputStream());
            String sndString;
            sndString = "명함을 보내시겠습니까?";
            sndWriter.writeUTF(sndString);
            sndWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
