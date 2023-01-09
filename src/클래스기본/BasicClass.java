package 클래스기본;

// 클래스 이름은 대문자로 시작하는 것이 관례이다.
public class BasicClass {
    public static void main(String[] args) {
        Car g80 = new Car("g80");
        System.out.println(g80.carName);
        Car santafe = new Car("santafe");
        System.out.println(santafe.carName);
    }
}

/*
    필드 : 클래스 포함된 변수를 의미합니다.
    클래스 변수
    인스턴스 변수
    지역 변수
 */
class Car {
    static String Manufacturer = "현대자동차"; // class var
    String carName = "G80"; // instance var

    Car(String name) {
        this.carName = name;
    }
}