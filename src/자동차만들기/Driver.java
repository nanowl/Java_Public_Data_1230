package 자동차만들기;

import java.util.Spliterator;

public class Driver {
    static String[] distance = {"", "4000", "200", "150", "300"};
    static int refuelCnt;
    static double time;

    public String getDist(int index) {
        String dist = distance[index];
        return dist;
    }
//    public void setLocation(int location) {
//        String dist = "";
//        switch (location) {
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//                dist = distance[location];
//                break;
//            default:
//                System.out.println("잘못 입력하셨습니다.");
//                break;
//        }
//    }

    public int totalPrice(int dist, int fuel, int cnt) {
        double total = 0;
        double a = Double.parseDouble(distance[dist]);
        total = a / fuel * 2000 * cnt;

        return (int)total;
    }


    public void getRefueling(int dist, int fuel, int fuelTank, int cnt) {
        int a = Integer.parseInt(distance[dist]);
        refuelCnt = ((a/fuel) / fuelTank + 1) * cnt;
    }

    public void totalTime(int dist, int speed, int cnt) {
        double a = Double.parseDouble(distance[dist]);
        time = a / speed * cnt;
    }

    public void viewInfo() {
        System.out.println("주유 횟수 : " + refuelCnt);
        System.out.println("총 시간 계산 : " + time);
    }

}
