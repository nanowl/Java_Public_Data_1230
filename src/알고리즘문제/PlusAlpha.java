package 알고리즘문제;

import java.util.Arrays;
import java.util.Scanner;

/*
    첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
    둘째 줄에는 N개의 수가 주어진다.
    수는 1,000보다 작거나 같은 자연수이다.
    셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

##
 */
public class PlusAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수의 개수 N, 횟수 M : ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int[] rst = new int[M];
        for (int i = 0; i < M; i++) {
            int fir = sc.nextInt();
            int end = sc.nextInt();
            while (fir <= end) {
                rst[i] += arr[fir-1];
                fir ++;
            }
        }

        Arrays.stream(rst).forEach(System.out::println);

    }
}
