package 알고리즘문제;

import java.util.Arrays;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int prop = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            int rd = (int) ((Math.random() * prop) + 1);
            arr[i] = rd;
            System.out.print(rd + " ");
        }
        System.out.println();
        System.out.println(shuffleCard(arr, prop));
    }
    static int shuffleCard(int[] arr, int prop) {
        int sum = 0;
        int rst = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= prop && rst < sum) rst = sum;
                }
            }
        }
        return rst;
    }
}
