package 입출력스트림예제5;

import java.io.*;

public class StreamEx5 {
    public static void main(String[] args) throws IOException {
//        try {
//            InputStream is = new FileInputStream("src/입출력스트림예제5/StreamEx6.java");
//            int data;
//            while ((data = is.read()) != -1) {
//                System.out.write(data);
//            }
//            is.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
        //FileOutputStream : 바이트 단위로 데이터를 파일에 저장할 때 사용하는 바이트 기반 출력 스트림
        // 바이트 단위로 저장하기 때문에 그림, 오디오, 텍스트등 모든 종류의 데이터를 파일저장 가능
        String originalFileName = "src/입출력스트림예제5/umai.jpeg";
        String targetFileName = "src/cloneMokoko.png";
        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);
            int readByteNo;
            byte[] readBuff  = new byte[100];
            while ((readByteNo = is.read(readBuff)) != -1) { // readByteNo 몇 바이트 읽어야 하는지 정보가 넘어 옴
                os.write(readBuff, 0, readByteNo);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
