package 스트림예제4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    스트림 자바8 버전에 추가된 문법임
    Stream 은 객체 요소를 처리하는 스트림(IntStream, LongStream, DoubleStream)은 각각의 기본타입인
    int, long, double 요소를 처리하는 스트림입니다.
    자바에서 제공하는 모든 컬렉션의 최고 상위 조상인 Collection 인터페이스에는 stream() 메소드가 정의되어 있음
 */
public class StreamEx4 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.stream().forEach(System.out::println);
        IntStream stream = IntStream.rangeClosed(1, 100); // 1 ~ 100까지의 합을 구하기
        int sum = stream.sum();
        System.out.println(sum);
    }
}
