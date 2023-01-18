package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    boolean isPower;
    int setTemp;
    int currTemp;
    boolean isCooler;
    boolean isHeater;
    int windStep;
    AirCon() { // 생성자 : 클래스가 객체가 될 때 자동으로 호출, 인스턴스 필드 초기화가 목적
        final int[] monthTemp = {-5, 3, 8, 15, 20, 26, 32, 30, 24, 16, 9 ,4};
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH); // month는 현재 몇 월인지 정보를 가져오는데 정보가 배열의 인덱스 같음
        currTemp = monthTemp[month];
        isPower = false;
        isHeater = false;
        windStep = 1;
    }
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"1단계", "2단계", "3단계"};
        System.out.println("======= 에어컨 정보 ========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);
    }
    //에어컨 설정하기
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + " 입니다.");
        System.out.print("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람세기를 설정하세요(1단/2단/3단) : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) {
            System.out.println("쿨러가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) {
            System.out.println("히터가 동작합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }

    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public void setCurrTemp(int n) {
        currTemp += n;
    }
    public int getCurrTemp() {
        return currTemp;
    }

    public int getSetTemp() {
        return setTemp;
    }
}
