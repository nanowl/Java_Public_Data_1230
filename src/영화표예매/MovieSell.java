package 영화표예매;

import java.util.Scanner;

public class MovieSell {
    int seat[] = new int[10];

    void printSeat() {
        for (int i = 0 ; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }

    void selectSeat( ) {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석변호를 입력하세요 : ");
        int seatNum = sc.nextInt();
        if (seat[seatNum-1] == 0) {
            seat[seatNum-1] = 1;
            printSeat();
        } else {
            System.out.println("이미 판매된 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }
    int totalAmount( ) {
        int cnt = 0;
        for (int val : seat) {
            if (val == 1) cnt ++;
        }
        return cnt * 12000;
    }
}
