package 객체를배열로관리;


import java.util.Scanner;

public class ObjectArrMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt];
        System.out.println("정보 입력");
        System.out.println("------------------------");
        for (int i = 0; i < cnt; i++) {
            nameCards[i] = new NameCard();
            System.out.print("이름 입력 : ");
            nameCards[i].setName(sc.next());
            System.out.print("이메일 입력 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("전화번호 입력 : ");
            nameCards[i].setPhone(sc.next());
            System.out.print("나이 입력 : ");
            nameCards[i].setAge(sc.nextInt());
        }

        for (NameCard e : nameCards) e.printInfo();
    }
}
