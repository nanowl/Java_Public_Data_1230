package 네트워크인터페이스;

/*
    모든 필든느 자동을 final static 으로 변환
    모든 메소드는 자동으로 추상메소드가 됩니다.
    디폴트 메소드 : 예외적으로 구현부를 가지면, 상속 받은 클래스에서 재정의 해서 사용 가능합니다.
    정적 메소드 객체와 상관없이 인터페이스 타입으로 사용 가능
 */
public interface NetworkInterface {
    void connect(); // 자동으로 abstract 와 public 이 자동을 붙음
}
class WiFi implements NetworkInterface {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결되었습니다.");
    }
}

class FiveG implements NetworkInterface {
    String company;
    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결되었습니다.");
    }
}

class LTE implements NetworkInterface{
    String company;
    LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결되었습니다.");
    }
}