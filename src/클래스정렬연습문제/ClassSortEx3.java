package 클래스정렬연습문제;

import java.util.*;

/*
    문제 : 첫번째 줄에 학생의 수 n을 입력
        두번째 줄 부터 학생의 이름과 성적을 공백 기준으로 입력
    3
    안유진 95
    정국 88
    유나 77
    출력 조건 : 모든학생의 이름을 성적이 낮은 순서대로 출력하기
    => HashMap 으로 만든 커피 메뉴에 메뉴를 10개를 입력하고 이를 가격순으로 정렬 되도록 변경
 */
public class ClassSortEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perCnt = sc.nextInt();
        TreeSet<Student> ts = new TreeSet<>(new CompareStudent());
        for (int i = 0; i < perCnt; i++) {
            System.out.print("이름 및 성적 입력 : ");
            ts.add(new Student(sc.next(), sc.nextInt()));
        }
        for (Student e : ts) System.out.println("name : " + e.name);

    }
}
