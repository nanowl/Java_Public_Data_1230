package 로또번호만들기응용;

import java.util.Scanner;

/*
    7개자리의 로또 번호 만들기
    1~6번째는 0~50사이의 수
    마지막 보너스 숫자는 50~100사이의 수
    배열을 사용해서 값을 구하고 출력. 중복 허용
 */
public class LottoApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[7];
        int index = 0;
        System.out.print("로또 번호를 생성하시겠습니까 (y/n) : ");
        String answer = sc.next();
        while (true){
            if (answer.equalsIgnoreCase("y")) {
                if (index == 6) {
                    lotto[index] = (int) ((Math.random() * 50) + 51);
                    System.out.println("+ " + lotto[index]);
                    break;
                } else {
                    lotto[index] = (int)(Math.random() * 50) + 1;
                    System.out.print(lotto[index] + " ");
                }
                index++;
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}
