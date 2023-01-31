package Set인터페이스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    SetInterface : 중복 허용하지 않음, 순서를 유지하지 않음
    HashSet : HashCode() method 리턴값을 사용하여 객체의 동일 여부 판단
 */
public class SetInterfaceEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001, "Yuna"));
        hashSet.add(new Member(1002, "Karina"));
        hashSet.add(new Member(1003, "Jin"));
        hashSet.add(new Member(1004, "Yujin"));

        for (Member e : hashSet) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("-----------------");
        }
    }
}
