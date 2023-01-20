package 중첩인터페이스;

public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화연결을 시도합니다.");
    }
}
