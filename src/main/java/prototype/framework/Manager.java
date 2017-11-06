package prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name){
        if( !showcase.containsKey(name) ) {
            throw new NameNotFoundException(String.format("%s is not found", name));
        }
        return showcase.get(name).createClone();
    }

    private final class NameNotFoundException extends RuntimeException {
        public NameNotFoundException(){}

        public NameNotFoundException(String msg) {
            super(msg);
        }
    }
}
