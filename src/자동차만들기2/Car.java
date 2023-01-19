package 자동차만들기2;

public abstract class Car {
    int maxSpeed;
    int fuelEff;
    int fuelTank;
    int seatCnt;
    String name;

    abstract void setMode(boolean isMode);

    int getMovingCnt(int passCnt) {
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }

    int getTotalCost(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }

    int getRefuelCnt(int dist, int moveCnt) {
        if (((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        else return ((dist * moveCnt) / fuelEff) / fuelTank;
    }

    double getMovingTime(int dist, int moveCnt) {
        return (double) dist * moveCnt / maxSpeed;
    }
}
