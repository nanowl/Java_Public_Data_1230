package 자동차만들기;

import java.util.Scanner;

/*
    - 기름값은 1리터당 2천원
    - 연비라는 건 리터당 주행거리를 의미 합니다.
    - 부산 400km, 강릉 200km, 대전 150km,  광주 300km
    - 처음 출발시 연료통에는 기름이 없는 상태 입니다.
 */

public class CarTotalExMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택 하세요 (1. 부산, 2. 대전, 3. 강릉, 4. 광주) : ");
        int location = sc.nextInt();
//        driver.setLocation(location);

        System.out.print("이동할 승객 수를 입력 하세요 ( 1 ~ 100 사이) : ");
        int passenger = sc.nextInt();

        System.out.print("이동 차량을 선택 하세요. (1. 스포츠카, 2.승용차, 3번 버스) : ");
        int carKind = sc.nextInt();
        System.out.print("차량 이름입력 : ");
        String carName = sc.next();
        switch (carKind) {
            case 1 :

                System.out.print("부가기능을 사용하시겠습니까 (y/n) : ");
                String func = sc.next();

                SportsCar sportsCar = new SportsCar(carName);
                int cnt = 1;
                if (sportsCar.seat < passenger) cnt+=1;

                System.out.println("이동에 필요한 총 비용 산출 : " + driver.totalPrice(location,sportsCar.getFuel(),cnt));

                if (func.equalsIgnoreCase("y")) sportsCar.setCustom(true);
                else sportsCar.setCustom(false);


                driver.getRefueling(location, sportsCar.getFuel(), sportsCar.getFuelTank(),cnt);
                driver.totalTime(location, sportsCar.getMAX_SPEED(),cnt);

                break;
            case 2 :
                System.out.print("부가기능을 사용하시겠습니까 (y/n) : ");
                String func1 = sc.next();

                Sedan sedan = new Sedan(carName);
                if (func1.equalsIgnoreCase("y")) sedan.setCustom(true);
                else sedan.setCustom(false);
                int cnt1 = 1;
                if (sedan.seat < passenger) cnt1+=1;
                System.out.println("이동에 필요한 총 비용 산출 : " + driver.totalPrice(location,sedan.getFuel(),cnt1));

                driver.getRefueling(location, sedan.getFuel(), sedan.getFuelTank(),cnt1);
                driver.totalTime(location, sedan.getMAX_SPEED(),cnt1);

                break;
            case 3 :
                System.out.print("부가기능을 사용하시겠습니까 (y/n) : ");
                String func2 = sc.next();
                Bus bus = new Bus(carName);
                int cnt2 = 1;
                if (bus.seat < passenger) cnt2+=1;
                System.out.println("이동에 필요한 총 비용 산출 : " + driver.totalPrice(location,bus.getFuel(),cnt2));

                if (func2.equalsIgnoreCase("y")) bus.setCustom(true);
                else bus.setCustom(false);

                driver.getRefueling(location, bus.getFuel(), bus.getFuelTank(),cnt2);
                driver.totalTime(location, bus.getMAX_SPEED(),cnt2);

                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }

        driver.viewInfo();

    }
}
