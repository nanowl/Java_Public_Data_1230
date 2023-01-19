package 코코아톡;

public class CocoaTalk {
    private String to;
    private String msg;
    public CocoaTalk(String name){
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg; //전달할 메시지 앞에 전달받는 사람 추가
    }

    public void send(NetAdapter na) {
        na.send(msg);
    }
}
