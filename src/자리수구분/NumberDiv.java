package 자리수구분;

import java.util.Scanner;

// 100의 자리의 수를 입력 받아서 3개 (100자리/10자리/1의자리)의 변수에 나누어 담기
/*
    365
    a=3, b=6, c=5
 */
public class NumberDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세자리 수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        System.out.println("100의 자릿수 : " + a);
        System.out.println(" 10의 자릿수 : " + b);
        System.out.println("  1의 자릿수 : " + c);
    }
}
