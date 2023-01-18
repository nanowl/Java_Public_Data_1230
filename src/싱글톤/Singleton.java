package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton() {
        name = "test";
        id = 100;
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
