package Map기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    HashMap : 키와 값의 pair 로 구성. 키는 중복 될 수 없고 값을 중복 가능
    키의 중복 여부 확인은 HashCode 를 이용해서 확인 .
    hash 알고리즘의 특징은 키 값을 해시함수의 입력을 전달하여 정수값의 결과를 반환 함.
 */
public class MapTestEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 99); // 키값이 같기 때문에 나중에 들어온 값으로 대체
        System.out.println("Entry count : " + map.size()); // show me the object in map
        System.out.println(map.get("동그라미"));
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + " : " + value);
//        }

        map.remove("최수연");
        System.out.println(map.size());

        //replace() method 를 이용해 값 수정
        map.replace("이준호", 91);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        map.clear(); // 객체 전체 삭제
    }
}
