package 평균은넘겠지;

import java.util.Scanner;

/*
    대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
    5 = > 총 테스트 케이스
    5 50 50 70 80 100 => 각 테스트에 대한 학생 수, 그리고 각 학생의 점수
    7 100 95 90 60 70 60 50
    3 70 90 80
    3 70 90 81
    9 100 99 98 97 96 95 94 93 91

    40.000%
    57.143%
    33.333%
    66.667%
    55.556%
 */
public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        double[] result = new double[testCase];
        for (int i = 0; i < testCase; i++) {
            result[i] = overRate();
        }
        for (double e : result) {
            System.out.printf("%.3f%%\n", e);
        }
    }

    /*
        각 케이스에 대한 학생수와 그리고 각각의 성적을 입력받음
        입력받은 성적에 대한 평균 구하기 (먼저 총점을 구해야함)
        평균을 넘는 학생 수 구하기 (소수점 이하 3자리 변환해서 반환)
     */
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int total = 0;
        int overCnt = 0;
        int[] score = new int[cnt];
        for (int i = 0; i< score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double aver = (double) total / cnt;
        for (int e : score) {
            if (e > aver) overCnt++;
        }
        return (double) overCnt / cnt * 100;
    }
}
