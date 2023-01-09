package 문자열추가;

import java.util.Scanner;

/*
    2개의 문자열을 입력 받고, 정수 n값을 입력 받음
    첫번째 문자열 입력 :
    두번째 문자열 입력 :
    정수값 입력 :
    첫번째 문자열의 뒤 부분의 n개의 문자를 두번째 문자열 앞에 끼워 넣는 코드작성
 */
public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String str1 = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String str2 = sc.next();
        System.out.print("정수값 입력 : ");
        int num = sc.nextInt();

        String sub = new String(str1.substring(str1.length()-num));

        System.out.println(sub + str2);
    }
}
