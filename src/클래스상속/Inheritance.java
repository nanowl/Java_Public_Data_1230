package 클래스상속;

/*
    상속(Inheritance) : 부모 클래스의 기능(필드, 메소드)을 그대로 물려 받는것
 */
public abstract class Inheritance {
    public static void main(String[] args) {
        HouseDog dog1 = new HouseDog();
        dog1.setName("happy");
        dog1.sleep(5);
    }
}
