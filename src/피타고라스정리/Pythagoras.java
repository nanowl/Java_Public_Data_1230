package 피타고라스정리;

import 쓰레드예제7.InterruptThread;

import java.util.*;

/*
    주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
    입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
    각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
    세변의 길이의 입력 순서는 정해져 있지 않다.
 */
public class Pythagoras {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        while (true){
            for (int i = 0; i < arr.length; i++) {
                int side = sc.nextInt();
                if (side < 0) break;
                arr[i] = side;
            }
            Arrays.sort(arr);
            if (Math.pow(arr[2], 2) == Math.pow(arr[0],2) + Math.pow(arr[1],2)) {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }
    }
}
