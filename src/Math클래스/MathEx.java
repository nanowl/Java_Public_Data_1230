package Math클래스;
/*
    수학에서 자주 사용하는 상수들과 메소드를 미리 구현해 놓은 클래스
    모든 메소드는 (static method)클래스메소드입니다. 그러므로 객체 생성 불가
 */
public class MathEx {
    public static void main(String[] args) {
        // random() : 0.0이상 1.0미만의 범위에서 임의의 double형 값 중 하나의 임의의 값 생성
        // 예 : 0~99 사이의 임의의 수 생성
//        for(int i = 0; i < 100; i++){
//            System.out.println((int) (Math.random() * 100) + 1);
//        }

        // abs() : 절대값을 구하는 함수
        System.out.println(Math.abs(-10));

        // floor() : 소수점이하를 날리고 가장가까운 정수값 출력
        // ceil() : 소수점이 있으면 무조건 올림
        // round() : 반올림
        System.out.println(Math.floor(10.9999999));
        System.out.println(Math.floor(10.0000001));
        System.out.println(Math.ceil(10.9999999));
        System.out.println(Math.ceil(10.0000001));
        System.out.println(Math.round(10.9999999));
        System.out.println(Math.round(10.0000001));

        // max() : 전달된 두 값 중 큰값
        // min() : 전달된 두 값 중 작은 값
        System.out.println(Math.max(10,4));
        System.out.println(Math.min(10,4));
    }
}
