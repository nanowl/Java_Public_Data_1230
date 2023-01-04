package 윤년구하기;

import java.util.Scanner;

// 연도가 4년 나누어지면 윤년이다. (4의 배수)
public class LeadYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0 ) || (year % 400 == 0))){
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}
