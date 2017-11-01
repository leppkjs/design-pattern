package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return Collections.unmodifiableList(owners);
    }

}
