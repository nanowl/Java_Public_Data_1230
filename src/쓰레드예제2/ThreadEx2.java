package 쓰레드예제2;

/*
    1. Thread 클래스를 상속받는 방법 (구현이 쉬움, 쓰레드를 상속받았기 때문에 다른 클래스 상속 불가)
    2. Runnable 인터페이스 구현하는 방법 ( 확장성이 좋음, 다른 클래스로부터 상속을 받을 수 있음)
    3. Runnable 인터페이스를 이용한 익명의 객체로 구현
    4. Runnable 인터페이스를 이용한 람다식으로 구현
 */
public class ThreadEx2 {
    public static void main(String[] args) {
        Runnable task = new Sample();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);
            }
        };
        Thread thread3 = new Thread(task2);
        thread3.start();
    }
}

class Basic  {

}
class Sample extends Basic implements  Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}