package TV상속;

public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isInternet;

    ProductTV() {
        super(true, 30, 30);
        name = "LG Smart TV";
    }

    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    @Override // 오버라이딩 성립 여부를 컴파일러에게 확인하도록 요청 함
    void setChannel(int channel) {
        if (channel > 0 && channel < 2000) {
            this.channel = channel;
        } else {
            System.out.println("채널설정 범위가 아닙니다.");
        }
    }

    void setChannel(int channel, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드입니다.");
            this.isInternet = true;
        } else {
            System.out.println("채널설정 범위가 아닙니다.");
        }
    }

    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);
    }
}
