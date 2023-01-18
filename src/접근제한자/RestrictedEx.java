package 접근제한자;

import 전자레인지.ParentRest;

/*
    접근제한자란? 객체지향 4가지 특징 중에 하나이며, 데이터 은닉 또는 캡슐화의 핵심 개념입니다.
    데이터은닉이란? 사용자가 알 필요가 없거나 숨겨야 할 정보를 보이지 않도록 하는 개념입니다.
    대형 프로젝트 진행 중 필드값을 외부에 접근 가능한 경우 여러가지 문제점이 발생할 수 있습니다.
 */
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getJobs();
    }
}
class ChildRest extends ParentRest {
    String jobs;

    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getMoney() { // protected (동일패키지와 상속관계가 성립하면 접근 허용)
        return money;
    }


}