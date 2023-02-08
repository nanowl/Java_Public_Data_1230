package 람다예제6;

import java.util.function.ToIntBiFunction;


/*
    매개변수의 메소드참조
    ToIntBiFunction<String, String> : 두개의 문자열을 입력받아 int 값을 반환
    compareToIgnoreCase() : 대소문자 구분없이 문자열을 아스키코드값으로 비교 후 결과를 반환
 */
public class LambdaEx6 {
    public static void main(String[] args) {
        ToIntBiFunction<String,String> function;

        function = (a, b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA8"));

        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("Java8", "JAVA8"));
    }

    public static void print(int order) {
        if(order<0) { System.out.println("사전순으로 먼저 옵니다."); }
        else if(order == 0) { System.out.println("동일한 문자열입니다."); }
        else { System.out.println("사전순으로 나중에 옵니다."); }
    }
}
