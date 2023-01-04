package 변수와데이터;

// 클래스 이름은 파일이름과 동일해야 함
// 실수는 소수점 이하 값이 존재하고 기본은 double형(8byte)
public class DataType {
    // 접근제한자/정적변수/반환타입/main()
    public static void main(String[] args) {
//        int taxRateValue; // 카멜 표기법 (JAVA)
//        int tax_rate_value; // 스네이크 표기법 (python,C)
        int num1, num2; // 같은 타입의 변수 콤마(,)로 구분해서 동시에 선언 및 초기화 가능
        double num3 = 3.14; // 선언과 동시에 초기화

        String name = "곰돌이 사육사";

        int hour = 3;
        int minute = 55;
        System.out.println(hour + "시 " + minute + "분 ");
        System.out.println(name);
        NameCard nameCard = new NameCard();
        nameCard.name = "곰돌이 사육사";
        nameCard.age = 20;
        System.out.println(nameCard.name);
        System.out.println(nameCard.age);

    }
}
// 사용자 정의 자료형

class NameCard {
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNumber;

}