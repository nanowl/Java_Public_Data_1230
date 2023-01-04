package 스위치문Ex;

import java.util.Scanner;

/*
    Switch문은 조건값에 따라 분기할 수 있으며, 조건값은 정수, 문자, 문자열이 올 수 있음.
 */
public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계절을 입력하세요 : ");
        String season = scanner.next();
        switch (season) {
            case "spring" :
                System.out.println("봄이 왔어요.");
                break;
            case "summer" :
                System.out.println("여름이 왔어요.");
                break;
            case "autumn" :
                System.out.println("가을이 왔어요.");
                break;
            case "winter" :
                System.out.println("겨울이 왔어요.");
                break;
        }
    }
}
