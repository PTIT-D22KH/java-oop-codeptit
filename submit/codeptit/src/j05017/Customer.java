package j05017;

import java.util.Comparator;

public class Customer {
    private String name, id;
    double preAmount, nextAmount;
    long totalCost;
    private static int count = 0;
    public Customer(String name, double preAmount, double nextAmount) {
        this.name = name;
        this.preAmount = preAmount;
        this.nextAmount = nextAmount;
        this.totalCost = calTotalCost();
        count++;
        String s = String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "KH" + s;
    }
    private long calTotalCost() {
        double diff = this.nextAmount - this.preAmount;
        double cost = 0;
        if (diff <= 50) {
            cost = (diff * 100) * 1.02;
        } else if (diff <= 100) {
            cost = 50.0 * 100.0 + (diff - 50.0) * 150.0;
            cost += 0.03 * cost;
        } else {
            cost = 50.0 * 100 + 50.0 * 150.0 + (diff - 100.0) * 200.0;
            cost += 0.05 * cost;
        }

        if(cost - (long)cost < 0.5) {
            return (long)cost;
        } 
        return (long)cost + 1;
    }
    public long getTotalCost() {
        return totalCost;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + totalCost;
    }
}
class CompareByTotalCost implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        if (a.getTotalCost() < b.getTotalCost()) {
            return 1;
        }
        return -1;
    }
}