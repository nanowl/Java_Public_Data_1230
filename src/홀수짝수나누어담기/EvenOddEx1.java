package 홀수짝수나누어담기;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 999를 입력하면 그만 받음
public class EvenOddEx1 {
    Scanner sc = new Scanner(System.in);
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void inputValue() {
        int value = 0;
        System.out.print("정수 입력 : ");
        while (true) {
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value);
        }
    }

    void separateValue()     {
        for (int e : inList) {
            if (e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }

    void outResult() {
        System.out.print("홀수 : ");
        for (int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for (int e : evenList) System.out.print(e + " ");
    }
}
