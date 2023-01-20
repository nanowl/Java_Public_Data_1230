package 알고리즘문제;

import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("색 번호 3가지를 입력하세요");
        System.out.println("[0]Black [1]Brown [2]Red [3]Orange [4]Yellow");
        System.out.print("[5]Green [6]Blue [7]Violet [8]Grey [9]White\n");
        int firColor = sc.nextInt();
        int secColor = sc.nextInt();
        int thrColor = sc.nextInt();
        long multi = 1;
        for (int i = 0; i < thrColor; i++) {
            multi *= 10;
        }

        long output = (firColor * 10 + secColor) * multi;
        System.out.println(output);
    }
}
