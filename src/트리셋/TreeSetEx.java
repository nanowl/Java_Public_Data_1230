package 트리셋;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(78);
        ts.add(45);
        ts.add(60);
        ts.add(54);
        ts.add(92);
        System.out.println(ts.headSet(60)); //미만
        System.out.println(ts.tailSet(60)); //이상
        System.out.println(ts.lower(60)); //바로 아래 점수
        System.out.println(ts.higher(60)); //바로 위 점수
    }
}
