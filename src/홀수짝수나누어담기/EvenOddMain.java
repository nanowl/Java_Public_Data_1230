package 홀수짝수나누어담기;


/*
    7개의 정수를 입력 받아 홀수와 짝수를 각각 배열에 나누어담기
    첫번째 메소드는 7개의 정수를 입력 받는 메소드
    두번째 메소드는 홀수와 짝수를 나누어 담는 메소드
    세번째 메소드는 결과를 출력하는 메소드

    inputArray[7]
    oddArray[7]
    evenArray[7]

    input : 1 2 3 4 5 6 7
    odd : 1 3 5 7
    even : 2 4 6
 */
public class EvenOddMain {
    public static void main(String[] args) {
        EvenOddEx1 ex1 = new EvenOddEx1();
        ex1.inputValue();
        ex1.separateValue();
        ex1.outResult();
    }
}