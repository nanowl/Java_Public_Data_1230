package 알고리즘문제;

import java.util.Arrays;
import java.util.Scanner;

/*
    7개의 정수를 입력받아 홀수짝수 나누어 출력하기
    스트림을 이용해서하기
 */
public class StreamTextEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 7개 입력 : ");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        System.out.print("짝수 : ");
        Arrays.stream(arr)
                .filter(e->e % 2 == 0)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("홀수 : ");
        Arrays.stream(arr)
                .filter(e->e % 2 != 0)
                .forEach(e -> System.out.print(e + " "));


    }
}
