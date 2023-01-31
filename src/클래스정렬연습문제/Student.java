package 클래스정렬연습문제;

import java.util.Comparator;

public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class CompareStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score > o2.score) return 1;
        else if(o1.score == o2.score) return 0;
        return -1;
    }
}