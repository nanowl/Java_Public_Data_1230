package 대소문자변경;

import java.util.Scanner;

/*
     입력받은 문자열에서 대문자는 소문자로 소문자는 대문자로 변경하기
     toUpperCase => TOuPPERcASE
     hint 1. 문자열에서 특정 문자를 추출하는 방법은 charAt(index)
     hint 2. 문자는 내부적으로 정수값으로 간주되어 사용된다. 아스키코드 차이는 32
     hint 3. 값을 출력 할때 정수 값이 아닌 문자로 표현하기 위해서는 형변환이 필요
 */
public class UpperLowerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();
        char[] strList = str.toCharArray();
        for (int i = 0; i < strList.length; i++) {
            if ((byte) strList[i] > 64 && (byte) strList[i] < 91) {
                strList[i] = (char) (strList[i] + 32);
            } else if ((byte) strList[i] > 96 && (byte) strList[i] < 123) {
                strList[i] = (char) (strList[i] - 32);
            }
        }
    }
}
