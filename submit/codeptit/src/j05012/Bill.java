package j05012;

import java.util.Comparator;

public class Bill {
    private String id, name;
    private long quantity, singlePrice, discount, totalPrice;
    public Bill(String id, String name, long quantity, long singlePrice, long discount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.singlePrice = singlePrice;
        this.discount = discount;
        this.totalPrice = singlePrice * quantity - discount;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + quantity + " " + singlePrice + " " + discount + " " + totalPrice;
    }
    public long getTotalPrice() {
        return totalPrice;
    }
}

class CompareByTotalPrice implements Comparator<Bill> {

    @Override
    public int compare(Bill o1, Bill o2) {
        // TODO Auto-generated method stub
        if (o1.getTotalPrice() < o2.getTotalPrice()) {
            return 1; // o2 comes before o1
        }
        return -1; // o1 comes before o2
    }
    
}