package 자동차만들기;

public class Car {
    int MAX_SPEED = 120;
    int fuelTank = 30;
    int fuel = 10;
    int seat = 4;

    public Car() {}

    public Car(int MAX_SPEED, int fuelTank, int fuel, int seat) {
        this.MAX_SPEED = MAX_SPEED;
        this.fuelTank = fuelTank;
        this.fuel = fuel;
        this.seat = seat;
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public void setMAX_SPEED(int MAX_SPEED) {
        this.MAX_SPEED = MAX_SPEED;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
