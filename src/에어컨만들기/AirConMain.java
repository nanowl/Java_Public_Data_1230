package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon airCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0;
        boolean isSetTemp = false;
        System.out.print("에어컨을 켜시겠습니까 (y/n) : ");
        String isON = sc.next();
        if(isON.equalsIgnoreCase("y")) {
            airCon.setPower(true);
            airCon.setAirConState();
            while (true) {
                sleep(1000);
                elapsedTime++;
                switch (airCon.getWindStep()) {
                    case 1 :
                        if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 :
                        if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 :
                        if(elapsedTime >= 20) isSetTemp = true; break;
                    default:
                }
                if (isSetTemp) {
                    if (airCon.isHeater()) airCon.setCurrTemp(1);
                    if (airCon.isCooler()) airCon.setCurrTemp(-1);
                    airCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if(airCon.getCurrTemp() == airCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.^^");
                    break;
                }
            }
        }
    }
}
