package 자동차만들기2;

public class Driver {
    void drive(Car car, int passCnt, int dist, boolean mode) {
        car.setMode(mode);
        int moveCnt = car.getMovingCnt(passCnt); // 승객수를 입력받아 이동횟수를 구함
        System.out.println("총 비용 : " + car.getTotalCost(dist, moveCnt));
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist, moveCnt));
        System.out.printf("총 이동시간 : %.3f\n" , car.getMovingTime(dist,moveCnt));
    }
}
