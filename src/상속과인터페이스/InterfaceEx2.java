package 상속과인터페이스;

import java.util.Scanner;

public class InterfaceEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 [1]Wifi [2]5G : ");
        int num = sc.nextInt();
        if (num == 1) {
            WiFi wifi = new WiFi("KT Megapass", "고유림");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else {
            FiveG fiveG = new FiveG("SK Telecom", "자마복");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg();
        }
    }
}
