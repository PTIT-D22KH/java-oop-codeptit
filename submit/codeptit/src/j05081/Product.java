package j05081;

import java.util.Comparator;

public class Product {
    private String id, name, unit;
    private long buyPrice, sellPrice, profit;
    private static int count = 0;
    public Product(String name, String unit, long buyPrice, long sellPrice) {
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        count++;
        this.id = String.format("MH%03d", count);
        this.profit = calProfit();
    }
    private long calProfit() {
        return sellPrice - buyPrice;
    }
    public long getProfit() {
        return profit;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", id, name, unit, buyPrice, sellPrice, profit);
    }
    
}
class CompareByProfitAndId implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        if (a.getProfit() == b.getProfit()) {
            return a.getId().compareTo(b.getId());
        } else if (a.getProfit() < b.getProfit()) {
            return 1;
        }
        return -1;
    }
}