package 리모컨인터페이스;

import java.util.Scanner;

public class RemoConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택 하세요 [1]TV [2]Audio [3]PS5 : ");
        int sel = sc.nextInt();
        RemoteControl remoCon;
        if (sel == 1) {
            remoCon = new Television();
            remoCon.turnOn();
            remoCon.setVolume(20);
            remoCon.getInfo();
            remoCon.setMute(true);
            RemoteControl.changeBattery();
        } else if (sel == 2){
            remoCon = new Audio();
            remoCon.turnOn();
            remoCon.setVolume(120);
            remoCon.getInfo();
        } else {
            RemoteControl rc = new RemoteControl() {
                int volume;

                @Override
                public void turnOn() {
                    System.out.println("PS5 를 켭니다.");
                }

                @Override
                public void turnOff() {
                    System.out.println("PS5 를 끕니다.");
                }

                @Override
                public void setVolume(int volume) {
                    if (volume > RemoteControl.MAX_VOLUME) {
                        this.volume = RemoteControl.MAX_VOLUME;
                    } else if (volume < RemoteControl.MIN_VOLUME) {
                        this.volume = RemoteControl.MIN_VOLUME;
                    } else {
                        this.volume = volume;
                    }
                    System.out.println("현재 Audio 볼륨 : " + this.volume);
                }

                @Override
                public void getInfo() {
                    System.out.println("PS5 입니다.");
                    System.out.println("현재 볼륨은 " + volume + " 입니다.");
                }
            };

            rc.turnOn();
            rc.setVolume(80);
            rc.getInfo();
            rc.turnOff();
        }
    }
}
