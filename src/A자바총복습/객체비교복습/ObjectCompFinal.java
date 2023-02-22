package A자바총복습.객체비교복습;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.TreeSet;

/*
    10명의 성적을 입력 받음 (미리 만들어 둠)
    이름 국어 영어 수학
    총점이 높은 순으로 정렬 총점이 같으면 이름 순 정렬
    comparator, comparable, collection 의 sort 를 이용하는 방법등이 있음
 */
public class ObjectCompFinal {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("ccy", 80,80,100));
        info.add(new StudentInfo("wyw", 100,98,95));
        info.add(new StudentInfo("ljh", 77,67,88));
        info.add(new StudentInfo("nhs", 55,45,35));
        info.add(new StudentInfo("nhl", 99,97,94));

//        for (StudentInfo e : info) {
//            System.out.println(e.getTotal() + " : " + e.getName());
//        }

        Iterator<StudentInfo>iterator = info.iterator();
        while (iterator.hasNext()) {
            StudentInfo itNext = iterator.next();
            System.out.println("" + itNext.getTotal() + " : " + itNext.getName());
        }
    }
}

class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotal() {
        return kor + eng + mat;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        else return o.getTotal() - this.getTotal();
    }
}