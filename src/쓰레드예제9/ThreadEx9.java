package 쓰레드예제9;
/*
    데몬쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드입니다.
    다른 쓰레드 모두 종료되면 자동으로 종료 됩니다.
    start() 메소드를 호출하기 전에 setDemon(true)를 호출하면 됨
 */
public class ThreadEx9 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(false);
        autoSaveThread.start();
        Thread.sleep(3000);
    }
}
class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장합니다.....");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            save();
        }
    }
}