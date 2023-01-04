package 입출력예제1;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        System.out.print("전화번호를 입력 하세요 : ");
        String phoneNumber = sc.next();

        System.out.println("======== 회원 정보 출력 ========");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("전화번호 : " + phoneNumber);
    }
}
//    byte a = sc.nextByte(); // 키보드로 입력받은 결과를 byte형으로 반환
//    short b = sc.nextShort();
//    int c = sc.nextInt();
//    long d = sc.nextLong();
//    char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출해서 반환
//
//    String str1 = sc.next(); // 문자열을 공백 기준으로 입력 받음
//    String str2 = sc.nextLine(); // 문자열을 줄넘김 기준으로 입력 받음