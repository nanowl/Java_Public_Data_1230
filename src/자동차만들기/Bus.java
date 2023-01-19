package 자동차만들기;

public class Bus extends Car{
    String busName;
    boolean custom;

    public Bus(String busName){
        MAX_SPEED = 150;
        fuelTank = 100;
        fuel = 5;
        seat = 20;
        this.busName = busName;
    }

    public int setCustom(boolean isTurbo) {
        if (isTurbo) {
            fuelTank = 100;
        } else {
            fuelTank = 130;
        }
        return fuelTank;
    }

}
