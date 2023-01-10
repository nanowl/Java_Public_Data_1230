package 소수판별하기;

import java.util.Scanner;

/*
    메소드를 이용한 소수 판별하기
    1과 자기자신 이외에는 나누어지지 않는 수
    정수를 받아서 해당 정수 미만의 소수를 찾아 합을 구하는 문제
    12를 입력 3 + 5 + 7 + 11 => 26
 */
public class PrimeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = sc.nextInt();
        System.out.println("소수 총합 : " + isSumPrime(num));
    }

    static int isSumPrime(int n) {
        int sum = 0;
        for (int i = n; i > 1; i--) {
            if (isPrime(i) == true) sum += i;
        }
        return sum;
    }

    // 매개변수로 전달 받은 정수값이 소수인지 아닌지 판별하기
    static boolean isPrime(int n) {
        int index = 2;
        while (index < n){
            if (n % index == 0) return false;
            index++;
        }
        return true;
    }
}
