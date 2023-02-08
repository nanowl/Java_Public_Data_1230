package 람다예제5;
/*
    메소드 참조 : 메소드를 참조해서 매개변수의 정보 및 리턴타입을 알아내서 불필요한 매개변수를 제거하는 목적.
 */

import java.util.function.IntBinaryOperator;

class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }

    public int instanceMethod(int x, int y) {
        return x + y;
    }
}

/*
    IntBinaryOperator : 두개의 int 타입에 대한 연산
    applyAsInt : 두개의 int 연산 ( 추상 메소드 )
    클래스::메소드
    참조변수::메소드
 */
public class LambdaEx5 {
    public static void main(String[] args) {
        IntBinaryOperator operator;
        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1 : " + operator.applyAsInt(1,2));

        operator = Calculator::staticMethod;
        System.out.println("결과 2 : " + operator.applyAsInt(3,4));

        // instance Method
        Calculator cal = new Calculator();
        operator = (x,y) -> cal.instanceMethod(x, y);
        System.out.println("결과 3 : " + operator.applyAsInt(5,6));
    }
}
