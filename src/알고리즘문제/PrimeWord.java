package 알고리즘문제;

import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String word = sc.next();
        int sum = getPrimeNumber(word);
        System.out.println(sum);
        if (isPrime(sum)) System.out.println("It is a prime word.");
        else System.out.println("It isn't prime word");

    }

    static int getPrimeNumber(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                sum += word.charAt(i) - ('a' - 1);
            else
                sum += (word.charAt(i) - ('A' - 1)) + ('z' - ('a' - 1));
        }
        return sum;
    }

    static boolean isPrime(int sum) {
        int cnt = 0;
        for (int i = 1; i <= sum; i++)
            if (sum % i == 0) cnt ++;

        if (cnt == 2) return true;
        else return false;
    }

}
