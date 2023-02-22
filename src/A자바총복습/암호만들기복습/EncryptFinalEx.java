package A자바총복습.암호만들기복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    평문을 입력 :
    암호키 :
    결과문구 :
 */
public class EncryptFinalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine();
        System.out.print("암호문 : ");
        String encrypt = sc.next();
        char[] enc = encrypt.toCharArray();
        char value = 0;
        List<Character> vig = new ArrayList<>();

        for (int i = 0; i < normal.length(); i++) {
            if (normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char) (normal.charAt(i) - (enc[i % encrypt.length()] - 'a') - 1);
                vig.add(value);
            }
        }

        vig.stream()
                .forEach(System.out::print);
    }
}
