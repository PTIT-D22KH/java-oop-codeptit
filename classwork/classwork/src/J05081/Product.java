package J05081;
import java.util.*;
public class Product implements Comparable<Product>{
    private static int count = 0;
    private String id, name, unit;
    private long buyPrice, sellPrice, profit;

    
    
    public Product(String name, String unit, long buyPrice, long sellPrice) {
        this.id = String.format("MH%03d", ++count);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + buyPrice + " " + sellPrice + " " + profit;
    }

    @Override
    public int compareTo(Product other) {
        if (this.profit == other.profit) {
            return this.id.compareTo(other.id);
        }
        return Long.compare(other.profit, this.profit);
    }


}
