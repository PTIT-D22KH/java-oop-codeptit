package j06002;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String id, name;
    private double price1, price2;
    private int type;
    private static Map<String, Product> productMap = new HashMap<>();
    public Product(String id, String name, double price1, double price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
        productMap.put(id, this);
    }
    public static Map<String, Product> getProductMap() {
        return productMap;
    }
    public String getName() {
        return name;
    }
    public double getPrice1() {
        return price1;
    }
    public double getPrice2() {
        return price2;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price1=" + price1 + ", price2=" + price2 + ", type=" + type
                + "]";
    }
    
}
