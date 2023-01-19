package 자동차만들기2;

import java.util.Scanner;

public class CarTotalMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300};
        Car car = null;
        Driver driver = new Driver();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int city = sc.nextInt();

        System.out.print("이동할 승객 수 입력 (1 ~ 100) : ");
        int passCnt = sc.nextInt();

        System.out.print("이동 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carSel = sc.nextInt();

        System.out.print("부가기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (carSel) {
            case 1 : car = new SportsCar("Ferrari Roma"); break;
            case 2 : car = new Sedan("BMW M340i"); break;
            case 3 : car = new Bus("Tourist Bus"); break;
            default: System.out.println("차량 선택이 잘 못 되었습니다.");
        }
        driver.drive(car, passCnt, dist[city], isMode);
    }
}
