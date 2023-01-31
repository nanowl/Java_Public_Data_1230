package 해시맵커피;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/*

 */

public class CoffeeMenuEx {
    Map<String, MenuInfo> tMap = new HashMap<>();
    TreeMap<String, MenuInfo> map = new TreeMap<String, MenuInfo>(tMap);
    String key;
    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }
    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "진한 커피입니다.."));
        map.put("Latte", new MenuInfo("Latte", 3500, "Coffee", "우유를 섞은 커피입니다.."));
        map.put("ColdBrew", new MenuInfo("ColdBrew", 3500, "Coffee", "우유를 섞은 커피입니다.."));
        map.put("LemonAde", new MenuInfo("LemonAde", 5500, "Ade", "레모네이드 입니다.."));
        map.put("PeachAde", new MenuInfo("PeachAde", 5000, "Ade", "복숭아에이드 커피입니다.."));
        map.put("BlackTea", new MenuInfo("BlackTea", 5800, "Tea", "홍차입니다.."));
        map.put("GreenTea", new MenuInfo("GreenTea", 3200, "Tea", "녹차입니다.."));
        map.put("MilkTea", new MenuInfo("MilkTea", 3200, "Tea", "밀크티입니다.."));
    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    System.out.println("======= 메뉴 보기 =======");
                    for (String  e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("-----------------------------");
                    }
                    break;
                case 2 :
                    System.out.print("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // 매개변수로 전달된 키가 Map 내에 존재하는지 여부를 확인하는 함수
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("-----------------------------");
                    } else System.out.println("해당 메뉴가 없습니다.");
                    break;
                case 3 :
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key= sc.next();
                    if (!map.containsKey(key)) {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String group = sc.next();
                        System.out.print("설명 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc)); // 키와 값을 추가함
                    } else System.out.println("해당 메뉴가 이미 존재합니다.");
                    break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("메뉴를 삭제하였습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    } break;
                case 5 :
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine(); // 공백을 입력받기 위해서..
                        map.replace(key, new MenuInfo(key, price, group, desc));
                    } else {
                        System.out.println("수정할 메뉴가 없습니다.");
                    } break;
                case 6 :
                    System.out.println("종료합니다.");
                    return;
                default: System.out.println("없는 메뉴입니다. 메뉴를 다시 선택하세요.");
            }
        }
    }
}
