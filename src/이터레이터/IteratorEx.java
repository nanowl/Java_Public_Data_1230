package 이터레이터;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
    Iterator<E> interface : 컬렉션 프레임워크에 저장된 요소를 읽어오는 방법을 Iterator 로 표준화하고 있음
    public interface Collection<E> extends Iterator<E> {}
    public interface List<E> extends Iterator<E> {}
    public interface Set<E> extends Iterator<E> {}
    boolean hasNext() : 다음의 요소가있는지 확인, 있으면 true
    E next() : 요소반환
    remove() : next() 로 읽어온 요소를 삭제
 */
public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            iterator.remove();
        }
    }
}
