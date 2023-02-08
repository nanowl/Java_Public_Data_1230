package 스트림예제7;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    스트림의 최종연산 : 중개연산을 통해 변환된 스트림은 마지막으로 최종연산을 통해 요소를 소모하여 결과를 표시
    최종연산 시 모든 요소를 소모한 해당 스트림은 더 이상 사용 할 수 없습니다.
    요소의 출력 : forEach()
    요소의 소모 : reduce() => 첫번째와 두번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세번째 요소를 가지고 또 다시 수행
    Optional : NPE(Null Pointer Exception)을 방지 할 수 있도록 도와주는 클래스이다.
 */
public class StreamEx7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("four", "two", "three", "one");
        stream.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("four", "two", "three", "one");
        Stream<String> stream2 = Stream.of("four", "two", "three", "one");
        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        OptionalInt sum = intStream.reduce((s1, s2) -> s1 + s2);
        System.out.println(sum.getAsInt());

        IntStream stream3 = IntStream.of(4,2,7,3,5,1,6);
        IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
        OptionalInt rst1 = stream3.sorted()
                .findFirst();
        System.out.println(rst1.getAsInt());
        OptionalInt rst2 = stream4.sorted()
                .findAny();

        /*
            요소의 검사 :
            - anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우 true
            - allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우 true
            - noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 못할 경우 true
         */
        IntStream stream5 = IntStream.of(30,90,70,10);
        IntStream stream6 = IntStream.of(30,90,70,10);
        IntStream stream7 = IntStream.of(30,90,70,10);
        System.out.println(stream5.anyMatch(n->n > 80)); // ture
        System.out.println(stream6.allMatch(n->n > 9)); // true
        System.out.println(stream7.noneMatch(n->n > 100)); // true
        /*
            요소의 통계 :
            - count() : 해당 스트림 요소의 총 개수를 long 타입으로 반환
            - max() : 해당 스트림 요소 중 제일 큰 값
            - min() : 해당 스트림 요소 중 제일 작은 값
         */
        IntStream stream8 = IntStream.of(30,90,70,10);
        IntStream stream9 = IntStream.of(30,90,70,10);
        IntStream stream10 = IntStream.of(30,90,70,10);
        System.out.println(stream8.count());
        System.out.println(stream9.max().getAsInt());
        System.out.println(stream10.min().getAsInt());
    }
}