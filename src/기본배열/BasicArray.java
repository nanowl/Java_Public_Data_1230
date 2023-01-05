package 기본배열;
/*
    배열이란? 같은 타입의 변수들로 이루어진 유한 집합
    배열을 구성하는 값을 배열의 요소(element)라고 하고, 배열에서의 위치를 인덱스라고 합니다.
    배열의 인덱스는 0부터 시작하며 음수 값을 가질 수 없습니다.
 */
public class BasicArray {
    public static void main(String[] args) {
        int[] score = {33, 44, 50, 67, 50};
        int sum;
        double avg;
        sum = 0;
        for (int e : score) {
            e += 10;
            sum += e;
        }
        avg = (double) sum / score.length;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", avg);

        sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = (double) sum / score.length;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", avg);
    }
}
