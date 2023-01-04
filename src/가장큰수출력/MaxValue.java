package 가장큰수출력;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세자리 수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;

        if (a > b) {
//            if (a > c) System.out.println("제일 높은 수 : " + a);
//            else System.out.println("제일 높은 수 : " + c);
            System.out.println(Math.max(a,c));
        } else {
//            if (b > c) System.out.println("제일 높은 수 : " + b);
//            else System.out.println("제일 높은 수 : " + c);
            System.out.println(Math.max(b,c));
        }
    }
}
