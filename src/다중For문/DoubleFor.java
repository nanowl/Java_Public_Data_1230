package 다중For문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {
        /*
            별찍기 응용
            정수 입력 받기 : 4
            *
            * *
            * * *
            * * * *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }


// 구구단
//        for (int i = 2; i< 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%d x %d = %d\n", i, j, (i * j));
//            }
//            System.out.println("==========");
//        }
    }
}
