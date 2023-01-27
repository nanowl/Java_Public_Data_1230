package Object클래스;

public class ObjectEx {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        // 해당 인스턴스의 정보르 문자열로 반환
        System.out.println(student.toString());
        System.out.println(student1.toString());


        student1 = student;
        System.out.println(student.equals(student1));
    }
}

/*
    상속을 받지 않았더라도 기본으로 Object 클래스로부터 상속을 받음
    Object 클래스는 toString(), equals(), clone(), hashCode() 등의 메소드를 포함하고 있음
 */
class Student {
    int id;
    String name;
}