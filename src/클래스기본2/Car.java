package 클래스기본2;

public class Car {
    static String manufacture; // class field
    String productName; // instance field
    String color;
    int maxSpeed;
    /*
        생성자는 클래스 이름과 동일하고 반환타입이 없음, void도 없음
        생성자는 클래스가 객체로 만들어 질 때 호출되고, 생성자가 없으면 보이지 않는 기본생성자가 호출됨
        생성자는 여러개 만들어 필요에 따라 적절한 생성자를 호출 할 수 있음 ( 생성자 오버로딩 )
        생성자 매개변수는 클래스를 객체로 만드는 위치에서 전달함
        생성자의 목적은 클래스가 객체로 만들어질때 해당 인스턴스 필드를 초기화 하는 것이 주목적임
     */
    Car() {
        productName = "이름없는 차";
        color = "색상도 없음";
        maxSpeed = 0;
    }
    Car(String name, String color, int speed){
        productName = name;
        this.color = color;
        maxSpeed = speed;
    }

    // setter method
    void setName(String name) {
        productName = name;
    }

    void setColor(String color) {
        this.color = color;
    }
    void viewCar() {
        System.out.println("차종 : " + productName);
        System.out.println("색상 : " + color);
        System.out.println("최속속력 : " + maxSpeed);
    };
}
