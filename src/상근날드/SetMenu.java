package 상근날드;

import java.util.Enumeration;
import java.util.Scanner;

/*
    상근날드에 3가지 햄버거와 2가지 음료를 판매합니다.
    3가지 햄버거의 가격 중 가장 싼 메뉴의 가격을 선택하고, 음료 중 가장 싼 메뉴의 가격을 선택
    세트 메뉴는 50원 할인 됨
    1000 1500 2000 500 1000 = 1500원에서 세트 메뉴 할인 => 1500
 */
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("햄버거 메뉴 3개, 음료수 2개의 가격을 입력하세요 : ");
        int[] menu = new int[5];
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int burger = menu[0];
        int juice = menu[3];
        for ( int i = 0; i < menu.length ; i++) {
            if (i < 3 && burger > menu[i]) burger = menu[i];
            if (i > 2 && burger > menu[i]) juice = menu[i];
        }



        System.out.printf("세트 메뉴의 가격은 %d원 입니다. \n", burger + juice - 50);


    }
}