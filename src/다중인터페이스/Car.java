package 다중인터페이스;

public class Car {
    protected int speed; // 같은 패키지와 상속관계에서 접근허용이 가능함
    protected String color;
    protected String year;
    public Car(int speed) {
        this.speed = speed;
        this.color = "white";
    }


    public void autoDrive() {

    }
}
