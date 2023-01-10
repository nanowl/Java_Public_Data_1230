package 클래스기본2;

public class ClassBasicEx {
    public static void main(String[] args) {
        Car g80  = new Car("genesis G80", "white", 230);
        Car santafe = new Car();
        g80.viewCar();
        santafe.productName = "싼타페";
        santafe.viewCar();
    }
}
