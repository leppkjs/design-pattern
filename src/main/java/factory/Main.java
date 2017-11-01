package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("T1");
        Product card2 = factory.create("T2");
        Product card3 = factory.create("T3");

        card1.use();
        card2.use();
        card3.use();
    }
}
