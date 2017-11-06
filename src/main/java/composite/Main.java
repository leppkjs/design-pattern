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

        System.out.println("");
        Entry kim = new Directory("Kim");
        Entry lee = new Directory("Lee");
        Entry park = new Directory("Park");
        usr.add(kim);
        usr.add(lee);
        usr.add(park);
        kim.add(new File("diary.html", 10));
        kim.add(new File("Composite.java", 20));
        lee.add(new File("memo.txt", 35));
        park.add(new File("game.doc", 28));
        park.add(new File("jenk.mail", 20));
        root.printList();
    }
}
