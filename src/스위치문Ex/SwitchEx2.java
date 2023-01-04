package 스위치문Ex;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계산식을 입력하세요 : ");
        int x = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int y = scanner.nextInt();
        switch (op) {
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 몫 : " + (x / y));
                System.out.println("나눗셈 나머지 : " + (x % y));
                break;
            default:
                System.out.println("연산자를 잘 못 입력했습니다.");
        }
    }
}
