package 싱글톤응용;

public class Test1 {
    SingletonEx2 single = SingletonEx2.getSingleton();
    void setInfo(String name, int id) {
        single.id = id;
        single.name = name;
    }

    void viewInfo() {
        System.out.println("이름 : " + single.id);
        System.out.println("아이디 : " + single.name);
    }
}
