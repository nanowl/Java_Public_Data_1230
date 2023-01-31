package 클래스정렬연습문제;

import java.util.Comparator;

public class Coffee {
    String menuName;
    int price;

    public Coffee(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

}

class CompareToCoffee implements Comparator<Coffee> {
    @Override
    public int compare(Coffee o1, Coffee o2) {
        if(o1.price > o2.price) return 1;
        else if(o1.price == o2.price) return 0;
        return -1;
    }
}
