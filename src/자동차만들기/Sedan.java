package 자동차만들기;

public class Sedan extends Car {
    String carName;

    Sedan(String carName) {
        this.carName = carName;
    }

    void setCustom(boolean trunkON) {
        if (trunkON) seat+=1; // seat = seat + 1;
    }

    @Override
    public void setMAX_SPEED(int MAX_SPEED) {
        super.setMAX_SPEED(MAX_SPEED);
    }

    @Override
    public void setFuel(int fuel) {
        super.setFuel(fuel);
    }

    @Override
    public void setFuelTank(int fuelTank) {
        super.setFuelTank(fuelTank);
    }

    @Override
    public void setSeat(int seat) {
        super.setSeat(seat);
    }
}
