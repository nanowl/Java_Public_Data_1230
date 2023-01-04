package 성적에대한등급;

import java.util.Scanner;

/*
    성적을 입력
    입력 성적이 0~100 사이가 아니면 "성적을 잘못 입력"
    90이상 A, 80 B, 70 C, 60 D, 나머지 F
 */
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int score = sc.nextInt();

        if (0 <= score && score <= 100) {
            if (score >= 90) System.out.print("성적 : A");
            else if (score >= 80) System.out.print("성적 : B");
            else if (score >= 70) System.out.print("성적 : C");
            else if (score >= 60) System.out.print("성적 : D");
            else System.out.print("성적 : F");
        } else {
            System.out.print("성적을 잘못 입력하셨습니다.");
        }
    }
}
