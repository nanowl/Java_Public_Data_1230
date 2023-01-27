package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    첫번째 배수에 대한 기본을 입력(주어진 값)
    연속으로 값 입력받기 (ArrayList 입력받은 값을 저장)
    0이면 종료
    입력받기를 종료한 이후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해서 출력
    예를들어 주어진 값이 3이면...
    99 is a multiple of 3.
    7 is NOT a multiple of 3.
 */
public class MultipleGetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("기준값 입력 : ");
        int multi = sc.nextInt();
        List<Integer> intList = new ArrayList<>();
        System.out.print("정수 입력 : ");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            else {
                intList.add(input);
            }
        }
        for (int e : intList) {
            if (e % multi == 0) System.out.println(e + " is a multiple of " + multi + ".");
            else System.out.println(e + " is NOT a multiple of " + multi);
        }
    }
}
