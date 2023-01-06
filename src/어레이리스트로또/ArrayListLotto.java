package 어레이리스트로또;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListLotto {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); //HashSet은 중복값을 허용하지 않는 특성이 있음.
        while (true) {
            int tmp = (int)(Math.random() * 45 ) + 1;
            set.add(tmp);
            if (set.size() == 6) break;
        }
//        List<Integer> list = new ArrayList<>();
//        int tmp; // 로또 번호를 생성해 임시 저장
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            if (list.contains(tmp) == false) {
//                list.add(tmp);
//            }
//            if (list.size() == 6) break;
//        }
//        for (int e : list) System.out.print(e + " ");
    }
}
