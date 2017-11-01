package singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start...");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println(String.format("%s, %s는 싱글턴이 같다.", singleton1.toString(), singleton2.toString()));
        } else {
            System.out.println("둘은 다른 인스턴스 입니다.");
        }

        System.out.println("End...");

    }
}
