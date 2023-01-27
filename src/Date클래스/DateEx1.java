package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    1970년 1월1일 0시0분0초로부터 msec 단위로 경화시간을 운영체제로부터 얻어냅니다.
    SimpleDateFormat() : 얻어낸 시간 정보를 우리가 원하는 날짜와 시간 형태로 변환하여 출력하는 포멧
 */
public class DateEx1 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = sdf.format(now);
        System.out.println(str);
    }
}
