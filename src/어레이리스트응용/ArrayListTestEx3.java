package 어레이리스트응용;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestEx3 {
    public static void main(String[] args) {
        List<MemberInfo> memberInfoList = new ArrayList<>();
        memberInfoList.add(new MemberInfo("안유진", "ayj", "ayj1234",
                "ayj@gmail.com", "010-1234-5678", 21));
        memberInfoList.add(new MemberInfo("장원영", "jwy", "jwy1234",
                "jwy@gmail.com", "010-3456-7890", 20));
        memberInfoList.add(new MemberInfo("유나", "yuna", "yuna1234",
                "yuna@gmail.com", "010-1111-9999", 21));

        for (MemberInfo info : memberInfoList) {
            info.viewInfo();
        }
    }
}
