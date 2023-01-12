package final메소드;

/*
    메소드에 final을 사용하면 상속받는 클래스에서
 */
public class Vehicle {
    int speed;
    String color;
    String name;
    final void accelerator() {
        System.out.println(name + "의 속도를 증가 시킵니다.");
    }
    final void breakPanel() {
        System.out.println(name + "의 속도를 감소 시킵니다.");
    }
}

class SportsCar extends Vehicle {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "Red";
    }

    int getSpeed() {
        if(isTurbo) return speed *= 1.2;
        return speed;
    }

    String isTurbo() {
        if (isTurbo) return "ON";
        return "OFF";
    }

    void setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo());
    }
}

class ElectricCar extends Vehicle {
    boolean isAutoDrv;
    ElectricCar(String name) {
        speed = 200;
        this.name = name;
        color = "White";
    }
    String isAutoDrv() {
        if (this.isAutoDrv) return "ON";
        return "OFF";
    }

    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }

    void viewCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율운전 : " + isAutoDrv());
    }
}