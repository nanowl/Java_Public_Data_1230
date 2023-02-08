package 스트림예제3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StreamEx3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("wyw", 99));
        list.add(new Student("csy", 96));
        list.add(new Student("kmw", 92));
        double avg = list.stream()
                .mapToInt(Student::getScore) // method reference
                // 최종연산
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
class MathInterface {
   static double pow(int a, int b) {
        int rst = 0;
        for (int i = 0; i < b; i++) {
            rst += (a * a);
        }
        return rst;
    }
}
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}