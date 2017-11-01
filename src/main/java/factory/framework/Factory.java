package factory.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory {
    List<Product> lists = new ArrayList<Product>();

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);

        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
