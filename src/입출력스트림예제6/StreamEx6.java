package 입출력스트림예제6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StreamEx6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/입출력스트림예제6/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis); // scanner 입력으로 파일을 읽음
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.print(line);
        }
    }
}