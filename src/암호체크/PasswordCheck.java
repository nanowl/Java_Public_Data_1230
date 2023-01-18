package 암호체크;

import java.util.Scanner;

/*
    암호체크
    암호의 길이는 10~30자 사이 (10 <= len <= 30)
    암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
    특수 문자는 (!, %, _, #, &, +, -, *, /) 중 1개
    입력받은 패스워드가 조건을 만족하면 "Good password", 만족하지 못하면 "Bad password" 출력
    반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료
 */
public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd;
        while (true) {
            System.out.print("암호 입력 : ");
            pwd = sc.next();
            if (pwd.equalsIgnoreCase("exit") || pwd.equals("종료")) break;
            System.out.println("길이 체크 : " + pwdCheck.validLength(pwd));
            if (!pwdCheck.validLength(pwd)) {
                System.out.println("Bad length password!!");
                continue;
            }
            if (!pwdCheck.validNumber(pwd)) {
                System.out.println("Bad Number password!!");
                continue;
            }
            if (!pwdCheck.validLowerAlphabet(pwd)) {
                System.out.println("Bad Lower password!!");
                continue;
            }
            if (!pwdCheck.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper password!!");
                continue;
            }


        }
//        int alpha, ALPHA, num, special;
//        while (true) {
//            alpha = 0;
//            ALPHA = 0;
//            num = 0;
//            special = 0;
//            System.out.print("암호 입력 (숫자, 소문자, 대문자, 특수문자 포함) : ");
//            String pwd = sc.next();
//            if (pwd.equalsIgnoreCase("exit") || pwd.equals("종료")) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            } else {
//               for (char e : pwd.toCharArray()){
//                    if (e >= 'a' && e <= 'z') {
//                        alpha += 1;
//                    } else if (e >= 'A' && e <= 'Z') {
//                        ALPHA += 1;
//                    } else if (e >= '0' && e <= '9') {
//                        num += 1;
//                    } else special += 1;
//                }
//                if (alpha > 0 && ALPHA > 0 && num > 0 && special > 0) {
//                    System.out.println("Good password.");
//                } else {
//                    System.out.println("Bad password.");
//                }
//            }
//
//        }

    }
}
