package StringKMP;

import java.util.Scanner;

/*
    입력 : Knuth-Morris-Pratt
    출력 : KMP
    입력 : Mirko-Slavko
    출력 : MS
 */
public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String input = sc.next();
        // 1. split() 이용
        String[] output = input.split("-");
        System.out.print("출력 : ");
        for (String e : output) {
            System.out.print(e.charAt(0));
        }
        // 2. charAt() 이용
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <='Z') {
                System.out.print(input.charAt(i));
            }
        }
        // 3. 0번째 문자 출력 -> '-' 이 후 문자 출력
            for (int i = 0; i< input.length(); i++) {
                if (i == 0) System.out.print(input.charAt(i));
                else {
                    if (input.charAt(i) == '-') System.out.print(input.charAt(i+1));
                }
            }
        // 4. 문자 배열로 변경 후 출력
        char[] ch = input.toCharArray();
        for (char e : ch) {
            if (e >= 'A' && e <= 'Z') System.out.print(e);
        }
    }
}
