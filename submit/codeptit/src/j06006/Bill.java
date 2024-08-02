package j06006;

import java.util.Comparator;

public class Bill {
    private String id;
    private Customer customer;
    private Product product;
    private int quantity;
    private long totalMoney, totalProfit;
    private static int count = 0;

    public Bill(String customerId, String productId, int quantity) {
        count++;
        this.id = String.format("HD%03d", count);
        this.quantity = quantity;
        this.customer = Customer.getCustomerMap().get(customerId);
        this.product = Product.getProductMap().get(productId);
        this.totalMoney = quantity * this.product.getSellPrice();
        this.totalProfit = quantity * this.product.getProfit();
    }   
    public long getTotalProfit() {
        return totalProfit;
    }
    @Override
    public String toString() {
        return id + " " + customer + product + " " + quantity + " " + totalMoney + " " + totalProfit;
    }
}
class CompareByTotalProfit implements Comparator<Bill> {
    @Override
    public int compare(Bill a, Bill b) {
        if (a.getTotalProfit() < b.getTotalProfit()) {
            return 1;
        }
        return -1;
    }
}