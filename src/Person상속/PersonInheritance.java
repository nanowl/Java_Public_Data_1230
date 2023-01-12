package Person상속;

/*
    인간(Person) 클래스 만들기
    - age (나이를 먹음) : 필드와 게터/세터
    - sleep (잠을 잠) : 필드와 게터/세터
    인간의 특성을 상속 받아 직장인 만들기
    - worker (정수값 : 일하는 시간) : 필드와 게터/세터
    인간의 특성을 상속받아 학생 만들기
    - study (열심히/적당히/놀면서) : 필드와 게터/세터
 */
public class PersonInheritance {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Student student = new Student();
        worker.setAge(25);
        worker.setInWorkTime(8);
        worker.setSleep(false);
        worker.viewWorker();

        student.setAge(17);
        student.setSleep(true);
        student.setLearning(3);
        student.viewStudent();
    }
}
