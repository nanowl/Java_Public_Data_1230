package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            sum += i;
        }
//        while (num > 0) {
//            sum += num;
//            num--;
//        }
        System.out.println("입력 받은 정수의 합은 " + sum + " 입니다.");
    }
}
