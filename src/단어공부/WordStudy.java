package 단어공부;

import java.util.Scanner;

/*
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내기
    단, 가장 많이 사용된 알파벳이 여러개인 경우 ? 출력
    Mississipi => ?
    zZa => z
 */
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String word = sc.next();
        int max = 0;
        char result = 0;
        for (int i = 0; i < word.length(); i++) { // 알파벳이 각각 몇개씩 나왔는지 alphabet 배열에 저장
            if (word.charAt(i) >= 'a') alphabet[word.charAt(i)-'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == max) result = '?';
            else if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) ('A' + i);
            }
        }

        System.out.println(result);

    }

//    static void getWord(String word) {
//        char result = 0;
//        int[] alphabet = new int[26];
//        char[] wordList = word.toLowerCase().toCharArray();
//        for (int i = 0; i < wordList.length; i++) {
//            for (int j = 0; j < alphabet.length; j++) {
//                if (wordList[i] == ('a' + j)) {
//                    alphabet[j]++;
//                }
//            }
//        }
//        int max = -1;
//        int index = 0;
//        while (index < alphabet.length) {
//            if (max < alphabet[index] && alphabet[index] != 0) max = alphabet[index];
//            else if (max==alphabet[index]) {
//                System.out.println("?");
//            }
//            index++;
//        }
//
//        for (int i = 0; i < alphabet.length; i++) {
//            if (alphabet[i] == max) {
//                result = (char)('A' + i);
//                System.out.println(result);
//            }
//        }
//    }
}
