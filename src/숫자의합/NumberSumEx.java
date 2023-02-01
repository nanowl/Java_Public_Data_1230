package 숫자의합;

import java.util.Arrays;
import java.util.Scanner;

/*
    문제 : N개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
 */
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 0;
            String exit = sc.next();
            if (exit.equalsIgnoreCase("0000")) {
                System.out.println("프로그램 종료.");
                break;
            } else {
                int[] arr = new int[exit.length()];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = exit.charAt(i) - '0';
                    sum += arr[i];
                }
                System.out.print("=> " + sum);
            }
        }

    }
}
