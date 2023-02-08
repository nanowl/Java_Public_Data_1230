package 람다예제6;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, LambdaMember> func1 = LambdaMember::new;
        LambdaMember member1 = func1.apply("kooma");
        BiFunction<String, String, LambdaMember> func2 = LambdaMember::new;
        LambdaMember member2 = func2.apply("kooma", "1234");

    }
}

class LambdaMember {
    String name;
    String id;
    public LambdaMember() {
        System.out.println("Member() 실행");
    }

    public LambdaMember(String id) {
        System.out.println("Member(String id) 실행");
    }
    public LambdaMember(String name, String id) {
        System.out.println("Member(String name, String id) 실행");
    }
    public String getId() { return this.id; }
}