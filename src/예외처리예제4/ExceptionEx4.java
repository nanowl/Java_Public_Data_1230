package 예외처리예제4;

import java.io.FileWriter;
import java.io.IOException;

/*
    finally : 프로그램 실행 도중에 예외상황이 발생하면 catch 구문이 수행됩니다.
    하지만 예외 발생 여부와 상관없이 항상 수행되어야하는 구문이 있는 경우 finally 로 처리합니다.
 */
public class ExceptionEx4 {
    public static void main(String[] args) {
        FileWriter f  = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static void shouldBeRun() {
        System.out.println("항상 수행되는 구문입니다.");
    }
}
