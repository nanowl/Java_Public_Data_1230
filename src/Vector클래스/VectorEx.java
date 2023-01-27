package Vector클래스;

import java.util.List;
import java.util.Vector;

/*
    ArrayList : 동적 배열(개수를 정할 필요가 없고 값이 추가될 때마다 사이즈가 커짐), 검색은 매우빠름
    삽입과 삭제는 매우느림 0(n), 동기화를 지원하지 않음(멀티쓰레드환경을 지원하지 않음), 물리적으로 연속공간
    Vector : 동적배열, 물리적으로 연속된 공간, 내부적으로 어레이리스트 구조와 동일, 동기화 지원하지만 느림
    LinkedList : 물리적으로 연속되어 있지 않음, 양방향 링크드 리스트, 검색 느림, 삽입/삭제 빠름
 */
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> vector = new Vector<>();
        vector.add(new NameCard("우영우", "yyy@gmail.com", "010-1234-4567", "변호사"));
    }
}
class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}