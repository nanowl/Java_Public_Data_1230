package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/test/test.txt", true);
            fw.write(65);
            fw.write(97);
            fw.flush();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
