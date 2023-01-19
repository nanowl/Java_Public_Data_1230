package 중복된배열;

import java.util.Scanner;

/*
    10개의 배열을 만들고 임의의 숫자를 입력받음 (가급적 중복된 숫자가 있도록 입력(1,2,3,4,5,6,1,3,4,5))
    중복된 문자 중 두번째 나오는 숫자의 위치 찾기 (위치는 인덱스가 아니고 실질적인 위치를 의미)
    임의의 수 입력 10개
    찾을 숫자 입력
 */
public class DuplicateArray {
    private static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 10개 입력 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("찾을 숫자 입력 : ");
        int find = sc.nextInt();

        findDuplicate(arr.length, find);
    }

    static void findDuplicate(int len, int find) {
        int tmp = 0;
        for (int j = 0; j < len; j++) {
            if (arr[j] == find) tmp+=1;
            if (tmp == 2) {
                System.out.println("두번째 " + find + "는 " + (j+1) + "번째 위치해있습니다.");
                return;
            }
        }
        System.out.println("중복이 아닙니다.");
    }
}
