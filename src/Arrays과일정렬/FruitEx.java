package Arrays과일정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/*
    Arrays.sort() : Comparator 사용하기
    정렬은 기본적으로 오름차순 정렬
    임의의 10개 과일이름의 배열 생성, 길이순으로 정렬하고 만약 길이가 같으면 사전순으로 정렬
    문자열 길이를 비교하기 : length()
    compareTo() : 문자열을 ASCII 코드값으로 비교해 결과를 양수/0/음수로 반환
    반환값이 양수이면 정렬 조건이 되고 음수이면 현 상태유지의 조건
 */
public class FruitEx {
    public static void main(String[] args) {
        String[] fruit = {"kiwi", "orange", "apple", "banana", "melon",
        "mango", "waterMelon", "cherry", "plum", "peach"};

        Arrays.sort(fruit, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길기 때문에 정렬 조건에 해당
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 첫번째보다 두번째가 사전순서상 앞이면 양수/0/-1
                    }
                    return -1;
                }
            }
        });
        System.out.println(Arrays.toString(fruit));
        String test = "abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("adcbe")); // 음수
    }
}
