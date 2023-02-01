package 쓰레드예제7;

import java.util.Scanner;

public class ThreadEx7 {
    public static void main(String[] args) {
//        RunThread runThread = new RunThread();
//        Scanner sc = new Scanner(System.in);
//        runThread.start();
//
//        while (true) {
//            String cmd = sc.next();
//            if (cmd.equalsIgnoreCase("exit")) {
//                runThread.setStop(true);
//                break;
//            }
//        }
        InterruptThread interThread = new InterruptThread();
        interThread.start();
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) { }
        interThread.interrupt();
    }
}
