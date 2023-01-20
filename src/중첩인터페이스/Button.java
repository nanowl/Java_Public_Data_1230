package 중첩인터페이스;

public class Button {
    OnClickListener listener; // 외부에서 생성된 객체의 주소가 대입

    void touch() {

    }
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    interface OnClickListener {
        void onClick();
    }
}
