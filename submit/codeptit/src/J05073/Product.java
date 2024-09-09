package J05073;

public class Product {
    private String firstId, lastId;
    private double tax, shippingFee;
    private long singlePrice;

    public Product(String billId, long singlePrice) {
        this.singlePrice = singlePrice;
        this.firstId = billId.substring(0, 1);
        this.lastId = billId.substring(billId.length() - 1);
        preSetTaxAndShippingFee();
    }

    public long getSinglePrice() {
        return singlePrice;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public double getTax() {
        return tax;
    }

    private void preSetTaxAndShippingFee() {
        if (lastId.equals("C")) {
            if (firstId.equals("T")) {
                this.tax = 0.29 * 0.95;
                this.shippingFee = 0.04;
            } else if (firstId.equals("C")) {
                this.tax = 0.1 * 0.95;
                this.shippingFee = 0.03;
            } else if (firstId.equals("D")) {
                this.tax = 0.08 * 0.95;
                this.shippingFee = 0.025;
            } else if (firstId.equals("M")) {
                this.tax = 0.02 * 0.95;
                this.shippingFee = 0.005;
            }
        } else {
            if (firstId.equals("T")) {
                this.tax = 0.29;
                this.shippingFee = 0.04;
            } else if (firstId.equals("C")) {
                this.tax = 0.1;
                this.shippingFee = 0.03;
            } else if (firstId.equals("D")) {
                this.tax = 0.08;
                this.shippingFee = 0.025;
            } else if (firstId.equals("M")) {
                this.tax = 0.02;
                this.shippingFee = 0.005;
            }
        }
    }
}