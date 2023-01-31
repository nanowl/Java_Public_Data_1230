package 쓰레드예제1;

/*
    멀티쓰레드란? 한개의 프로그램이 여러가지 일을 동시에 처리하는 것 (반복문이 여러개 동시에 도는것과 비슷함)
    Main Thread : 모드 자바 Application 은 Main Thread 가 main() 메소드를 실행하면서 시작 됨
    멀티쓰레드에서는 메인 쓰레드가 종료되더라도 실행중인 쓰레드가 있으면 프로그램은 종료되지 않는다.
 */
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread thread = new TestThread();
        thread.start();
        thread.run();
    }
}
class TestThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}