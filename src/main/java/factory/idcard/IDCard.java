package factory.idcard;

import factory.framework.Product;

/**
 *
 */
public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    public void use() {
        System.out.println(this.owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return this.owner;
    }
}