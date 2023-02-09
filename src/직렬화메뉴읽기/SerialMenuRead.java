package 직렬화메뉴읽기;

import 해시맵커피.MenuInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();
    }
    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/jeongyeob/직렬화파일/커피메뉴직렬화.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, MenuInfo> map = new HashMap<>();
        map = (Map<String, MenuInfo>) ois.readObject();
        for (String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("메뉴 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("---------------------------------");
        }
        ois.close();
        fis.close();
    }
}
