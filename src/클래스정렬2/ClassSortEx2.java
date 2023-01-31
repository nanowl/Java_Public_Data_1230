package 클래스정렬2;


import java.util.TreeSet;

public class ClassSortEx2 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<Fruit>(new AscendingComp());
        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("수박", 10000));
        ts.add(new Fruit("딸기", 15000));

        for (Fruit e : ts) {
            System.out.println("이름 : " + e.name);
            System.out.println("가격 : " + e.price);
        }
    }
}
