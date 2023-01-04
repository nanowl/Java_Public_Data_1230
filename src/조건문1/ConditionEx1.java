package 조건문1;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "(은)는 소문자 입니다.");
        } else if (ch >='A' && ch <= 'Z') {
            System.out.println(ch + "(은)는 대문자 입니다.");
        } else {
            System.out.println(ch + "(은)는 알파벳이 아닙니다.");
        }
    }
}
