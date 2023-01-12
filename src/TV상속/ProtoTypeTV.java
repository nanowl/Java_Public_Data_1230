package TV상속;

public class ProtoTypeTV {
    protected boolean isPower;
    int channel;
    int volume;
    ProtoTypeTV() {
        isPower = false;
        channel = 10;
        volume = 10;
    }
    ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    void setChannel(int channel) {
        if (channel > 0 && channel < 1000) {
            this.channel = channel;
        } else {
            System.out.println("채널설정 범위가 아닙니다.");
        }
    }

    void setVolume(int volume) {
        if (volume >= 0 && volume < 101) {
            this.volume = volume;
        } else {
            System.out.println("음량설정 범위가 아닙니다.");
        }
    }
}
