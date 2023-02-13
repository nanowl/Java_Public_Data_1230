package 이미지전송클라이언트;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ConnectException;
import java.net.Socket;

public class ImageClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8990);
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            BufferedInputStream bis = new BufferedInputStream(ois);
            OutputStream os = new FileOutputStream("src/이미지전송클라이언트/mokoko.png");
            int readByteNo;
            byte[] readBuff  = new byte[1500];
            while ((readByteNo = bis.read(readBuff)) != -1) { // readByteNo 몇 바이트 읽어야 하는지 정보가 넘어 옴
                os.write(readBuff, 0, readByteNo);
            }
            os.flush();
            ois.close();
            socket.close();
        } catch (ConnectException e) {
            System.out.println("연결실패 !!!!!");
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
