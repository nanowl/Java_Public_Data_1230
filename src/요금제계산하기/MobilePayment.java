package 요금제계산하기;

import java.util.Scanner;

/*
    영식 요금제 : 30초마다 10씩 청구 (30초 미만이면 1통, 30초 부터 2통 ~~ )
    민식 요금제 : 60초마다 15씩 청구 (60초 미만이면 1통, 60초 부터 2통 ~~ )
    통화 횟수 : 3
    통화 시간 : 40 70 45
    둘 중 싼 요금제 이름을 표시하고 통 요금 계산 (영식 요금제 : 총 통화 금액)
    총 통화 금액이 같으면 ( 영식/민식 요금제 : 총 통화 금액 )
 */
public class MobilePayment {
    public static void main(String[] args) {
        int[] callTime = new int[20];
        int young = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 : ");
        int count = sc.nextInt();
        System.out.print("통화 시간 : ");
        for (int i = 0; i < count; i++) {
            callTime[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            young += (callTime[i] / 30 + 1) * 10;
            min += (callTime[i] / 60 + 1) * 15;
        }
        if (young < min) {
            System.out.printf("영식 요금제 : %d원\n", young);
        } else {
            System.out.printf("민식 요금제 : %d원\n", min);
        }


    }
}
