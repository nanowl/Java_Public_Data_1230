package 이미지전송클라이언트;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class ImageClient {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.10.245", 8999);
            System.out.print("서버 접속 성공!");
            System.out.print("저장할 위치를 지정하세요.(경로/파일명) : ");
            String path = sc.nextLine();
            Thread imTh =
                    new ImgClientTh(socket,  "src/이미지전송클라이언트/"+ path + ".jpg");
            imTh.start();
            socket.close();
        } catch (ConnectException e) {
            System.out.println("연결실패 !!!!!");
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}

class ImgClientTh extends Thread {
    Socket socket;
    String path;

    public ImgClientTh(Socket socket, String path) {
        this.socket = socket;
        this.path = path;
    }

    @Override
    public void run() {
        try {
            InputStream input = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream(path);
            int len;
            byte[] buffer = new byte[1024];
            while((len = input.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("이미지 전송 완료 !!!!!");
            fos.flush();
            fos.close();
        } catch (IOException e) {}
    }
}