package 쓰레드예제5;

public class ThreadEx5 {
    public static void main(String[] args) {
        SumThread sumTh = new SumThread();
        sumTh.start();
        try {
            sumTh.join();
        } catch (InterruptedException e){}
        System.out.println("합 : " + sumTh.getSum());
    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            sum++;
        }
    }
}