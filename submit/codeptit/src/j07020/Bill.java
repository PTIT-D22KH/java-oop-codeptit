package j07020;

public class Bill {
    private String id;
    private Customer customer;
    private Product product;
    private int quantity;
    private long totalMoney;
    private static int count = 0;

    public Bill(String customerId, String productId, int quantity) {
        count++;
        this.id = String.format("HD%03d", count);
        this.quantity = quantity;
        this.customer = Customer.getCustomerMap().get(customerId);
        this.product = Product.getProductMap().get(productId);
        this.totalMoney = quantity * this.product.getSellPrice();
        
    }   
    @Override
    public String toString() {
        return id + " " + customer + product + " " + quantity + " " + totalMoney;
    }
}