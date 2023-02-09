package 자바파일입출력실습;


public class StudentScore implements Comparable<StudentScore> {
    String name;
    int sum;

    public StudentScore(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public int compareTo(StudentScore o) {
        if (this.sum == o.sum) { // 차의 연식이 같으면
            return this.name.compareTo(o.name); // 이름을 기준으로 사전순 정렬
        } else if (this.sum > o.sum) return -1;
        else return 1;
    }
}
