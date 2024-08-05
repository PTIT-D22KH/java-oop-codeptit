package j07050;

import java.util.Comparator;

public class Item{
    // private int id;
    private static int count = 0;
    private String id, name, group;
    double buyPrice, sellPrice, profit;

    public Item(String name, String group, double buyPrice, double sellPrice) {
        count++;
        this.id = String.format("MH%02d", count);
        this.name = name;
        this.group = group;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }
    public double getProfit() {
        return profit;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", this.profit);
    }
    



}
class CompareByProfitDesc implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        // TODO Auto-generated method stub
        return Double.compare(b.getProfit(), a.getProfit());
    }
}