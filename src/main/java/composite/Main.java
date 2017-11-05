package composite;

public class Main {

    public static void main(String[] args) {
        Entry root = new Directory("root");
        Entry bin = new Directory("bin");
        Entry tmp = new Directory("tmp");
        Entry usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 100));
        bin.add(new File("latex", 30));

        root.printList();
    }
}
