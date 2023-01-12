package TV상속;

public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("LG Smart TV");
        lgTV.setPower(true);
        lgTV.setVolume(50);
        lgTV.setChannel(1500, true);
        lgTV.viewTV();
    }
}
