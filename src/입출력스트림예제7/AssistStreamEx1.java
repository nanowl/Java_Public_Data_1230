package 입출력스트림예제7;

import java.io.*;

/*
    보조스트림은 데이터를 변환해서 입출력하고자 하거나, 데이터의 출력형식을 지정하고 싶은 경우,
    그리고 성능개선이 필요한 경우 사용
    InputStreamReader : 문자의 인코딩 방식 지정할 때 사용
 */
public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in; // console 입력을 받아 저장
//        Reader reader = new InputStreamReader(is);
//        int readCharNo;
//        char[] cBuf = new char[100];
//        while ((readCharNo = reader.read(cBuf)) != -1) {
//            String data = new String(cBuf, 0, readCharNo);
//            System.out.print(data);
//        }
//        reader.close();
        FileOutputStream fos = new FileOutputStream("src/입출력스트림예제7/file.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
        writer.write(data);
        writer.flush();
        writer.close();
        System.out.print("파일저장이 끝났습니다.");
    }
}
