package J07049;
import java.util.*;
public class Product {
    private String id, name;
    private long singlePrice, warranty;
    private static Map<String, Product> productMap;
    public Product(String id, String name, long singlePrice, long warranty) {
        this.id = id;
        this.name = name;
        this.singlePrice = singlePrice;
        this.warranty = warranty;
        productMap.put(id, this);
    }

    public static Map<String, Product> getProductMap() {
        return productMap;
    }
}
