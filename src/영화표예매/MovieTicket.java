package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        MovieSell movieSell = new MovieSell();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            int selMenu = sc.nextInt();
            if (selMenu == 1) movieSell.selectSeat();
            else {
                System.out.println("총 판매금액 : " + movieSell.totalAmount() + "원");
                break;
            }
        }
    }
}
