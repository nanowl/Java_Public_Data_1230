package 문자열자르기;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String[] time = sc.next().split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);
        if(hour > 11) System.out.printf("오후 %02d시 %02d분 %02d초\n", (hour - 12), min, sec);
        else System.out.printf("오전 %02d시 %02d분 %02d초\n", hour, min, sec);
//        int[] num = new int[3];
//        String result;
//        for (int i=0; i<time.length; i++) {
//            num[i] = Integer.parseInt(time[i]);
//            if (num[0] > 23 || num[i] > 59) {
//                System.out.println("잘못 입력함");
//                return;
//            }
//            if (num[i] < 10) time[i] = "0" + num[i];
//        }
//
//        if (num[0] > 12) {
//            num[0] = num[0]-12;
//            time[0] = "오후 " + num[0];
//        }
//        else if (num[0] < 12) time[0] = "오전 " + time[0];
//        else time[0] = "오후 " + num[0];
//
//        result = String.format("%s시 %s분 %s초", time[0], time[1], time[2]);
//        System.out.println(result);

    }
}
