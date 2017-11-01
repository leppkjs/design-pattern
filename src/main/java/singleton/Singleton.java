package singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Singleton을 생성 했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
