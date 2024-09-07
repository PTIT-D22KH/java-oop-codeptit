package J05073;

public class Bill {
    private String id;
    private double totalPrice;
    private long numBuy;
    private Product product;

    public Bill(String s) {
        String[] a = s.trim().split("\\s+");
        this.id = a[0];
        long singlePrice = Long.parseLong(a[1]);
        this.numBuy = Long.parseLong(a[2]);
        this.product = new Product(id, singlePrice);
        this.totalPrice = calTotalPrice();
    }

    private double calTotalPrice() {
        double importCost = numBuy * (product.getSinglePrice() * (1 + product.getShippingFee() + product.getTax()));
        return Math.round((importCost * 1.2 / numBuy) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return id + " " + String.format("%.2f", totalPrice);
    }
}