package 최대값최솟값구하기;

import java.util.Scanner;

/*
    정수를 입력받음 (배열의 갯수)
    입력 받은 정수의 크기만큼의 배열생성
    배열의 크기만큼 순회하면서 임의의 정수 값 입력
    입력받은 배열에서 최솟값과 최댓값 출력
    정수값 : 10
    1 3 5 7 2 6 12 34 9 11
    min : 1
    max : 34
 */
public class MinMaxArray {
    public static void main(String[] args) {
        int Min,Max;
        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        //정수값 입력받기
        System.out.print("배열의 크기 입력 : ");
        int tmp = sc.nextInt();
        //입력받은 정수값으로 배열생성
        int[] list = new int[tmp];
        //생성된 배열의 크기만큼 순회하면서 임의의 정수 입력받음
        System.out.print("임의의 숫자를 배열의 크기만큼 n회 입력 : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        //최솟값, 최댓값을 구하기 위해 배열의 첫번째값 대입
        Min = list[0]; Max = list[0];
        //반복문을 순회하면서 최솟값과 최댓값 찾기
        for (int i = 0; i < list.length; i++) {
            if (Min > list[i]) Min = list[i];
            if (Max < list[i]) Max = list[i];
        }
        //결과 출력
        System.out.printf(" 최솟값 : %d\n 최댓값 : %d\n ", Min,Max);
    }

}
