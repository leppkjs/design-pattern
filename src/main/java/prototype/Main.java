package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {

    public static void main(String[] args){
        Manager manager = new Manager();
        UnderlinePen undeline = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("strong Message", undeline);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);

        //생성
        Product p1 = manager.create("strong Message");
        p1.use("Hello World");

        Product p2 = manager.create("warning box");
        p2.use("Hello World");

        Product p3 = manager.create("slash box");
        p3.use("Hello World");

    }
}
