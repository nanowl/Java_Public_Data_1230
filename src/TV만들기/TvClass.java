package TV만들기;

public class TvClass {
    private boolean isON; // TV의 전원에 대한 상태 값 저장. 접근제한자를 설정 ( 캡슐화 )
    private int channel; // TV의 채널 상태 값 저장
    private int volume; // TV의 볼륨 상태 값 저장

    TvClass() {
        isON = false;
        channel = 10;
        volume = 10;
    }
    TvClass(boolean isON, int channel, int volume) {
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
    }
    // 외부에서 전원 값을 변경할 수 있도록 제공되는 메소드
    void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV가 " + onOffStr + "되었습니다.");
    }

    void setChannel(int cnl) {
        if (cnl >= 0 && cnl <= 999) {
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경하였습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("볼륨을 " + volume + "으로 변경 하였습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }

    void getTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=== TV Information ===");
        System.out.println("Power : " + onOffStr);
        System.out.println("channel : " + this.channel);
        System.out.println("volume : " + this.volume);
    }
}
