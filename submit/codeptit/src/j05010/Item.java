package j05010;

public class Item implements Comparable<Item>{
    private int id;
    private static int count = 0;
    private String name, group;
    double buyPrice, sellPrice, profit;

    public Item(String name, String group, double buyPrice, double sellPrice) {
        count++;
        this.id = count;
        this.name = name;
        this.group = group;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", this.profit);
    }
    @Override
    public int compareTo(Item o) {
        // TODO Auto-generated method stub
        if (this.profit < o.profit) {
            return 1;
        }
        return -1;
    }



}
