package 중첩인터페이스;

import java.util.*;

/*
    중첩 인터페이스는 클래스 내부에 선언한 인터페이스입니다.
    중첩 인터페이스는 주로 UI
 */
public class NestedInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
