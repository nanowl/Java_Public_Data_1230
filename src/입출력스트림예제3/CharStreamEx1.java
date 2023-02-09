package 입출력스트림예제3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamEx1 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
//        char[] data = "일타스캔들 대행사".toCharArray();
        String data = "일타스캔들 대행사 미스터션샤인";
        writer.write(data);
//        for (int i = 0; i < data.length(); i++) {
//            writer.write(data[i]);
//        }
        writer.flush();
        writer.close();
    }
}
