package 자바파일입출력실습;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileInOutStreamEx {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/자바파일입출력실습/Student.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        showSortedList(fis);
        fis.close();
    }

    static void showSortedList(FileInputStream fis) {
        Scanner sc = new Scanner(fis); // scanner 입력으로 파일을 읽음
        Set<StudentScore> ts = new TreeSet<>();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int sum = 0;
            String[] score = line.split(" ");
            for (int j = 1; j < score.length; j++) {
                sum += Integer.parseInt(score[j]);
            }
            ts.add(new StudentScore(score[0], sum));
        }
        ts.stream()
                .forEach(e -> System.out.print(e.name + " " + e.sum +"\n"));
    }
}

