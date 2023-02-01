package 쓰레드예제4;
/*
    yield() : 다른 쓰레드에 실행을 양보하는 메소드, 하지만 양보에 대한 권한은 운영체제가 관리하기 때문에 생각보다 잘 안 됨.
 */
public class ThreadEx4 {
    public static void main(String[] args) {
        ThreadA thA = new ThreadA();
        ThreadB thB = new ThreadB();
        thA.start();
        thB.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        thA.work = false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        thA.work = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        thA.stop = true;
        thB.stop = true;
    }
}

class  ThreadA extends Thread {
    boolean stop = false;
    boolean work = true;
    @Override
    public void run() {
        while (!stop) {
            if (work) System.out.println("ThreadA가 작업 중 입니다.");
            else Thread.yield(); // 작업중이 아니면 쓰레드 실행을 양보
        }
    }
}
class  ThreadB extends Thread {
    boolean stop = false;
    boolean work = true;
    @Override
    public void run() {
        while (!stop) {
            if (work) System.out.println("ThreadB가 작업 중 입니다.");
            else Thread.yield(); // 작업중이 아니면 쓰레드 실행을 양보
        }
    }
}