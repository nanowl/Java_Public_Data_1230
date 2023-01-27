package 클론메소드;
/*
    Cloneable 상속 받아 구현해야할 메소드는 없음
    clone() 메소드는 데이터 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 사용가능
 */

import 추상클래스응용.Phone;

public class Member implements Cloneable{
    String id;
    String name;
    String pwd;
    int age;
    boolean isAdult;

    public Member(String id, String name, String pwd, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.isAdult = isAdult;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론메소드의 반환타입은 Object 타입
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cloned;
    }
}
