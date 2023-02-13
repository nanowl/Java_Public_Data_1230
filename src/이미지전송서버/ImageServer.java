package 이미지전송서버;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ImageServer {
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
                System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress()+" ] 연결");
                System.out.print("이미지를 전송하시겠습니까? (yes/no) : ");
                String confirm = sc.next();
                if (confirm.equalsIgnoreCase("yes")) {
                    Thread imgTh = new ImageServerTh(socket);
                    imgTh.start();
                }
            }

        } catch(IOException e) {}
    }
}

class ImageServerTh extends Thread {
    Socket socket;

    public ImageServerTh(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        byte[] imageByte;
        try {
            BufferedImage img = ImageIO.read(new File("/Users/jeongyeob/Dev/work_java/Java_Public_Data_1230/src/cloneMokoko.png"));
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            BufferedOutputStream bos = new BufferedOutputStream(oos);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "png", baos);

            imageByte = baos.toByteArray();
            bos.write(imageByte, 0, imageByte.length);
            baos.flush();
            System.out.println(socket.getRemoteSocketAddress().toString() + "에게 전송 완료");
            oos.close();
        } catch (IOException e) {}
    }
}
