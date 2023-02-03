package 진수변환;

import java.util.Scanner;

/*
    문제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
    입력 : 첫째줄에 8진수가 주어짐
    출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력, 수가 0인 경우를 제외하고 반드시 1로시작
    314 => 각자리의 수 0~7
    11001100
    000 001 010 011 100 101 110 111
          1  10  11 100 101 110 111
 */
public class ConversionEx {
    public static void main(String[] args) {
        String[] arr1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        Scanner sc = new Scanner(System.in);
        String oct = sc.next();
        int[] arr2 = new int[oct.length()];
        String rst  = "";
        for (int i = 0; i < arr2.length; i++) {
            if (oct.charAt(i) -'0' < 8  && oct.charAt(i) - '0' > -1 ) {
                arr2[i] = oct.charAt(i) - '0';
                rst += arr1[arr2[i]];
            } else {
                System.out.println("8진수가 아닙니다");
                return;
            }
        }
        System.out.println(Integer.parseInt(rst));
    }
}
