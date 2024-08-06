package j07020;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String id, name, unit;
    private long buyPrice, sellPrice;
    private static int count = 0;
    private static Map<String, Product> productMap = new HashMap<>();
    public Product(String name, String unit, long buyPrice, long sellPrice) {
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        count++;
        this.id = String.format("MH%03d", count);
        productMap.put(id, this);
    }
    public static Map<String, Product> getProductMap() {
        return productMap;
    }
    public long getSellPrice() {
        return sellPrice;
    }
    public long getBuyPrice() {
        return buyPrice;
    }
    public String getName() {
        return name;
    }
    public String getUnit() {
        return unit;
    }
    @Override
    public String toString(){ 
        return name + " " + unit + " " + buyPrice + " " + sellPrice;
    }
    
}
