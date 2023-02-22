package A자바총복습.인터페이스복습;

import java.util.Scanner;

/*
    인터페이스에 포함된 메소드는 기본적으로 추상 메소드입니다. (구현부가 없는것이 특징)
    구현부가 없기 때문에 인터페이스의 메소드를 상속받은 클래스는 반드시 해당 메소드를 구현해야 함.
    인터페이스는 다중 상속 지원을 위해서 사용.
 */
public class InterfaceFinalEx {
    public static void main(String[] args) {
        NetAdapter adapter;
        CocoaTalk cocoaTalk = new CocoaTalk("ccd");
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]와이파이 [2]5G : ");
        int sel = sc.nextInt();
        if (sel == 1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTalk.writeMsg("how are you?");
        cocoaTalk.connect(adapter);
        cocoaTalk.send(adapter);
    }
}
class CocoaTalk {
    private String to;
    private String msg;

    public CocoaTalk(String name) {
        this.to = name; // 상대방 이름
    }

    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }

    public void connect(NetAdapter adapter) {
        adapter.connect();
    }

    public void send(NetAdapter adapter) {
        adapter.send(msg);
    }
}
interface NetAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi에 연결이 성공했습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G에 연결이 성공했습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}