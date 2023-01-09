package 문자열반전;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
//        char ch;
//        char[] strList = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(str.length()-i-1);
//            strList[i] = ch;
//            System.out.print(strList[i] + "");
//        }

//        int index = str.length();
//        while (index > 0) {
//            index--;
//            System.out.print(str.charAt(index));
//        }
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
