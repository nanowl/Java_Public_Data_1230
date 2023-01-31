package 프로퍼티예제2;

import java.util.Properties;

public class AppPropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");
        Member member = new Member();
        member.getMemberProperty();
    }
}

class Member {
    public void getMemberProperty() {
        Properties properties = new Properties();
        System.out.print("timeout : " + properties.getProperty("timeout"));
        System.out.print("language : " + properties.getProperty("language"));
        System.out.print("size : " + properties.getProperty("size"));
        System.out.print("capacity : " + properties.getProperty("capacity"));
    }
}