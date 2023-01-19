package 추상클래스응용;

/*
    추상클래스 만들기
    일반필드, 메소드 포함 가능
 */
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) {
        this.name = name;
    }
    void setPower(boolean power) {
        isPower = power;
        if (isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }

    public abstract void call();
}
