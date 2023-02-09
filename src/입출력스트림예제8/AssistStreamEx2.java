package 입출력스트림예제8;

import java.io.*;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int data = -1;
        long start = 0;
        long end = 0;
        fis = new FileInputStream("src/입출력스트림예제8/cloneMokoko.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/cloneX2Mokoko.png");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.print("버퍼를 사용하지 않는 경우에 대한 시간 : " + (end - start) + "ms");
    }
}
