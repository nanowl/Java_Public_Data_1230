package Person상속;

public class Person {
    int age;
    boolean sleep;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }
    void viewPerson() {
        System.out.println("나이 : " + age);
        System.out.println("상태 : " + sleep);
    }
}

class Worker extends Person {
    int inWorkTime ;

    public int getInWorkTime() {
        return inWorkTime;
    }

    public void setInWorkTime(int inWorkTime) {
        this.inWorkTime = inWorkTime;
    }
    void viewWorker() {
        System.out.println("나이 : " + age);
        System.out.println("상태 : " + sleep);
        System.out.println("일한 시간 : " + inWorkTime);
    }
}

class Student extends Person {
    String learning;

    public String getLearning() {
        return learning;
    }

    public void setLearning(int learning) {
        String[] status = {"", "열심히", "적당히", "놀면서"};
        this.learning = status[learning];
    }

    void viewStudent() {
        System.out.println("나이 : " + age);
        System.out.println("상태 : " + sleep);
        System.out.println("공부 집중도 : " + learning);
    }
}