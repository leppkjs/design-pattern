package adapter;

public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("print 상속을 통한...");
        Print print2 = new PrintBanner2("print 위임을 통한...");

        print.printStrong();
        System.out.println("------------------------------");
        print.printWeak();

        System.out.println("=============================");

        print2.printStrong();
        System.out.println("------------------------------");
        print2.printWeak();
    }
}
