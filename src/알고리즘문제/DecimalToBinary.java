package 알고리즘문제;

import java.util.Scanner;
// 10진수 2진수로 바꾸는 문제
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("10진수 입력 : ");
        int decimal = sc.nextInt();
        System.out.print("2진수 입력 : ");
        int binary = sc.nextInt();

        System.out.println(binToDec(decimal));
        System.out.println(decToBin(binary));
    }

    static int binToDec(int dec) {
        int bin;
        int sum = 0;
        int pos = 1;
        while (dec != 0) {
            bin = dec % 2;
            sum = sum + bin * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
//        int rst = 0;
//        int decimal = bin;
//        int tmp = 0;
//        while (true) { // 나머지를 제외한 decimal 이 2의 몇 승인지 구하는 반복문
//            if (bin < 2) break;
//            bin = bin/2;
//            tmp++;
//        }
//        for (int i = tmp; i > 0; i--) {
//            if (decimal / (int)Math.pow(2, i) >= 1) {
//                rst += (int)Math.pow(10, i);
//                decimal = decimal % (int)Math.pow(2,i);
//            } else {
//                rst += (decimal % 2);
//                decimal -= decimal % 2;
//            }
//        }
        return sum;
    }
    static int decToBin(int decimal) {
        String len = decimal+"";
        int bin = 0;
        for (int i = 0; i < len.length(); i++) {
            if (len.charAt(i) - '0' == 1) {
                bin += (int) Math.pow(2,len.length()-i);
            }
        }
        return bin / 2;
    }
}
