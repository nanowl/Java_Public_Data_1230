package 간판만들기;

import java.util.Scanner;

/*
    임의의 숫자를 입력 받음 : 120
    120에 대한 차지하는 공간을 계산하는 것
    120 => 1 + 2 + 1 + 3 + 1 + 4 + 1 => 13
 */
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        String len = sc.next();
        char[] ch = len.toCharArray();
        int num, tmp, result;
        result = 0;

        for (char e : ch) { // 아스키코드를 이용해 아라비아 숫자의 범위인지 확인하는 코드
            if ( e < 48 || e > 57) return; // 숫자 이외에 것이 들어오면 프로그램 종료
        }

        for (int i = 0 ; i < ch.length; i++) {
            num = Integer.parseInt(String.valueOf(ch[i]));
            if (num == 0) tmp = 4;
            else if(num == 1) tmp = 2;
            else tmp = 3;
            result += tmp+1;
        }
        System.out.print(Integer.parseInt(len) + " => " + (result+1) );
    }
}
