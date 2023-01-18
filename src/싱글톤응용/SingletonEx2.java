package 싱글톤응용;

import 싱글톤.Singleton;

public class SingletonEx2 {
    String name;
    int id;
    private static SingletonEx2 singleton = new SingletonEx2();
    private SingletonEx2() {
        name = "test";
        id = 100;
    }

    public static SingletonEx2 getSingleton() {
        return singleton;
    }

}
