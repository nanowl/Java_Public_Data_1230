package 메소드기본;
/*
    메소드는 하나의 기능을 수행하는 모듈입니다. (함수와 동일하며 객체 내에서 클래스내에 포함됩니다.)
    접근제한자 반환타입 메소드이름(매개변수목록) {구현부; return;}
    접근제한자란? 해당 메소드가 접근 할 수 있는 범위를 명시합니다.
    반환타입 : 메소드가 호출되어 작업을 수행하고 결과를 반환하는 데이터 타입을 명시합니다.
    매개변수 목록 : 메소드 호출 시 전달되는 인수의 값을 저장하는 변수를 명시
    메소드 이름 : 변수 생성 규칙과 동일 ( 영어 대/소문자, $,_, 숫자가 올 수 있는데 숫자는 맨 앞에 위치 할 수 없음.)
 */
public class BasicMethod {
    public static void main(String[] args) {
        SampleMethod sampleMethod = new SampleMethod();
        System.out.println(sampleMethod.sum(100, 200));
        sampleMethod.say();
    }
}
