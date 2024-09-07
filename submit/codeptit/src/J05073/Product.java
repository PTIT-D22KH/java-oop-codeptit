package J05073;

public class Product {
    private String firstId, lastId;
    private double tax, shippingFee;

    private long singlePrice;

    public Product(String billId, long singlePrice) {
        this.singlePrice = singlePrice;
        this.firstId = billId.substring(0, 1);
        this.lastId = billId.substring(3);
        preSetTaxAndShippingFee();
    }

    private preSetTaxAndShippingFee() {
        
    }
}
