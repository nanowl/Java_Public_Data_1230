package 자동차만들기;

class SportsCar extends Car {

    String name;

    SportsCar(String name) {
        MAX_SPEED = 250;
        fuel = 8;
        fuelTank = 30;
        seat = 2;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int setCustom(boolean isTurbo) {
        if (isTurbo) {
            MAX_SPEED = 300;
        } else {
            MAX_SPEED = 250;
        }
        return MAX_SPEED;
    }
}