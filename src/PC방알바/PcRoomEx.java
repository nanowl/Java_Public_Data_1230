package PC방알바;

import java.util.Scanner;

/*
    피시방에는 피씨가 100대 있습니다.
    손님은 자신이 원하는 피씨를 사용하고 싶어 합니다.
    손님의 수 입력 : 7
    손님의 선택한 좌석 번호 : 1 2 3 4 5 5 5
    거절 횟수 : 2
 */
public class PcRoomEx {
    public static void main(String[] args) {
        int cancel = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("손님의 수 입력 : ");
        int cnt = sc.nextInt();
        int[] seatNum = new int[100];
        System.out.print("손님의 선택한 좌석 번호 : ");
        for (int i = 0; i < cnt; i++) {
            int seat = sc.nextInt();
            if (seatNum[seat-1] == 1) cancel++;
            else seatNum[seat-1] = 1;
//            int cancelCnt = 0;
//            int seat = sc.nextInt();
//            for (int j = 0; j < i; j++) {
//                if (seat == seatNum[j]) cancelCnt += 1;
//            }
//            if (cancelCnt == 0) seatNum[i] = seat;
//            else cancel += cancelCnt;
        }
        System.out.println("거절 횟수 : " + cancel);
    }
}
