package J05012;

import java.util.Comparator;

public class Bill {
    private Product product;
    // private String id;
    private long numBuy, discount, totalCost;
    // private static int count = 0;

    public Bill(String id, String name, long singlePrice, long numBuy, long discount) {
        this.product = new Product(id, name, singlePrice);
        this.numBuy = numBuy;
        this.discount = discount;
        this.totalCost = this.product.getSinglePrice() * this.numBuy - this.discount;
        // count++;
        // this.id = String.format("ML%02d", count);
    }
    public long getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString () {
        return product.getId() + " " + product.getName() + " " + numBuy + " " + product.getSinglePrice() + " " + discount + " " + totalCost;
    }
}
class CompareByTotalCost implements Comparator<Bill> {
    @Override

    public int compare(Bill a, Bill b) {
        return Long.compare(b.getTotalCost(), a.getTotalCost());
    }
}