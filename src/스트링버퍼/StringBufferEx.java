package 스트링버퍼;

import java.lang.*; // 자동으로 컴파일러에 의해서 추가 됨.

/*
    StringBuffer : 문자열을 추가하거나 변경 할 때 사용되는 자료형 (동기화 처리가 있음)
    StringBuilder : 문자열을 추가하거나 변경 할 때 사용되는 자료형 (동기화 처리가 없음)
    String : 문자열을 + 연산자로 추가하면 매번 더할 때마다 새로운 문자열이 생성 됨
 */
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("to java");
        sb.append(", ");
        sb.append("javaScript");
        sb.delete(1,3);
        sb.insert(0, "test");
        System.out.println(sb);
        System.out.println(sb.substring(0,4));
    }
}
