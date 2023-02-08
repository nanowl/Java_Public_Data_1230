package 람다예제2;
// 매개변수가 있는 람다식 : MyFuncInterface fi = x -> {....}
@FunctionalInterface // 함수형 인터페이스 문법 체크를 위한 어노테이션
interface MyFuncInterface {
    void method(int x); // 함수형 인터페이스는 메소드를 하나만 선언할 수 있다. 2개 이상이면 error.
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);
    }
}
