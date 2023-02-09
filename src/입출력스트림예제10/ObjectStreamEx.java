package 입출력스트림예제10;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamEx {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board board : list) {
            System.out.println(
                    board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" +
                            board.getWriter() + "\t" + sdf.format(board.getDate()));
        }
    }

    public static void writeList() throws IOException {
        List<Board> list = new ArrayList<>(); // List 생성
        list.add(new Board(1, "C++", "고성능언어", "우영우", new Date()));
        list.add(new Board(2, "java", "객체지향언어", "동그라미", new Date()));
        list.add(new Board(3, "Python", "간결한언어", "이준호", new Date()));

        FileOutputStream fos = new FileOutputStream("board.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 객체 출력 스트림을 이용해서 list 출력
        oos.flush();
        oos.close();
    }

    public static List<Board> readList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("board.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject();
        return list;
    }
}
