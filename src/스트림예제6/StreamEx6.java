package 스트림예제6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
    스트림 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환 됩니다.
    중개 연산은 연속으로 연결해서 여러개 사용 가능합니다.
    filter() : 해당 스트림에서 주어진 조건에 맞는 요소로만 구성된 새로운 스트림 반환
    distinct() : 요소의 중복제거 (내부적으로 equals() 메소드 사용)
    map() : 스트림의 요소들을 주어진 함수에 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 반환 합니다.
 */
public class StreamEx6 {
    public static void main(String[] args) throws IOException {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,1,1,3,4,5,6,7);
        // 중복 제거
        stream1.distinct()
                .forEach(e->System.out.print(e + " "));
        System.out.println();
        // 짝수 제거
        stream2.filter(n->n % 2 != 0)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream3.map(s->s.length())
                .forEach(System.out::println);

        String[] arr = {"I study hard", "You study Java", "I am hungry"};
        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s->Stream.of(s.split(" +"))).forEach(System.out::println);

        // limit : 해당 스트림의 첫번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 리턴
        IntStream stream4 = IntStream.range(0,10);
        stream4.limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // skip : 해당 스트림의 첫번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 스트림 반환
        IntStream stream5 = IntStream.range(0,10);
        stream5.skip(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // skip, limit 같이 사용
        IntStream stream6 = IntStream.range(0,10);
        stream6.skip(3).limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // 스트림 정렬 sorted() : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream7 = Stream.of("JAVA","HTML","CSS","JS");
        stream7.sorted().forEach(s->System.out.print(s + " "));
        System.out.println();
//        Path path = Paths.get("src");
//        Stream<Path> stream = Files.list(path);
//        stream.forEach(p->System.out.println(p.getFileName()));
    }
}
