package 알람설정;

import java.util.Scanner;

/*
    상근이라는 친구가 있는데, 이 친구는 매일 학교를 지각을 합니다.
    창영이라는 친구는 지각하지 않는 방법을 알려 줍니다.
    알람을 설정하면 자동으로 설정 시간보다 45분 일찍 울리도록 설정함.
    ex) 입력 시간을 시간과 분으로 입력 받기
        입력 받은 시간에서 45분 이전에 알람이 울리도록 설정
 */
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("기상시간을 설정해주세요 : ");
        int hour = sc.nextInt();
        System.out.print("분을 설정해주세요 : ");
        int minute = sc.nextInt();

        int calc = hour * 60 + minute;

        if (calc < 45) {
            calc = 24 * 60 + minute;
        }
        calc -= 45;

        System.out.printf("%d시%d분\n", (calc / 60), (calc % 60));


//        if (minute <= 45 && minute > 0 ) {
//            if (hour < 1) {
//                hour = 24;
//            }
//            hour--;
//            minute = 60 - (45-minute);
//            System.out.print("기상시간은 " + hour + "시 " + minute + "분 입니다");
//        } else if (minute > 45 && minute < 60) {
//            System.out.print("기상시간은 " + hour + "시 " + (minute-45) + "분 입니다");
//        } else {
//            System.out.print("시간을 잘못 입력하셨습니다.");
//        }
    }
}
