package 클래스상속;

public class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
    void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
}

class HouseDog extends Dog {
    @Override
    void sleep() {
        System.out.println(name + "이(가) 오랜동안 잠을 잡니다.");
    }

    void sleep(int hour) { // Overloading
        System.out.println(name + "이(가) " + hour + "시간 동안 잠을 잡니다.");
    }
}
