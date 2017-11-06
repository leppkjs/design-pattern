package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        int sideLength = length+4;
        for(int i=0; i < sideLength; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(String.format("%s %s %s", decoChar, s, decoChar));
        for(int i=0; i < sideLength; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product = null;

        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return product;
    }
}
