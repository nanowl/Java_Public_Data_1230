package 평균구하기;

import java.util.Arrays;
import java.util.Scanner;

/*
    5명의 학생이 시험을 치는데 시험점수가 40점 미만이면 보충수업으로 듣는 조건으로 점수를 40으로 수정
    모든 학생이 40점 미만인 경우 보충 수업을 듣기로 함
    모든 학생이 성적에 대한 평균을 구하기
 */
public class ArrayAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[5];
        System.out.print(" 5명의 학생의 시험성적을 입력하세요 : ");
        for (int i = 0; i < student.length; i++) {
            int tmp = sc.nextInt();
            if (tmp < 101 && tmp >= 0) student[i] = tmp;
            else {
                System.out.print("다시 입력하세요 : ");
                i--;
            }
        }
        double total = 0;
        for (int i = 0; i < student.length; i++) {
            if ( student[i] < 40) {
                System.out.printf("%d번 학생의 점수는 %d점으로 보충 수업을 듣습니다.\n", i + 1, student[i] );
                student[i] = 40;
            }
            total += student[i];
        }
        System.out.printf("평균 점수 : %.2f\n", total/5);
    }
}
