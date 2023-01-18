package 전자레인지;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    3개의 시간조절용 버튼 A, B, C가 달려 있습니다.
    A 버튼은 5분, B 버튼은 1분, C 버튼은 10초 단위로 설정이 가능
    예를 들어 요리시간 100초가 소요 된다면 (B버튼 1회, C버튼 4회) => T = 014
    3개의 버튼은로 시간을 맞출 수 없는 경우 -1을 출력
 */
public class MicrowaveEx {
    public static void main(String[] args) {
        int[] cnt = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("전자레인지를 동작할 시간을 입력해주세요 : ");
        int time = sc.nextInt();
        String T = "";
        if (time % 10 != 0) System.out.println(-1); // 3개의 버튼은로 시간을 맞출 수 없는 경우 -1을 출력
        else {
            cnt[0] = time / 300;
            cnt[1] = (time % 300) / 60;
            cnt[2] = ((time % 300) % 60) / 10;
            for (int i = 0; i < cnt.length; i++) {
                T += cnt[i] + "";
            }
            System.out.println("T = " + T);
        }
    }
}
