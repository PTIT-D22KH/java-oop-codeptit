package j05037;

import java.util.Comparator;

public class Product {
    private String id, name, unit;
    private double buyPrice, quantity, sellPrice, shippingFee, totalPrice;

    private static int count = 0;

    public Product(String name, String unit, double buyPrice, double quantity) {
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.quantity = quantity;
        count++;
        this.id = String.format("MH%02d", count);
        this.shippingFee = calShippingFee(buyPrice, quantity);
        this.sellPrice = calSellPrice(buyPrice, quantity, shippingFee);
        this.totalPrice = calTotalPrice(sellPrice, quantity);
    }
    private double calShippingFee(double buyPrice, double quantity) {
        return roundDouble(buyPrice * quantity * 5/100);
    }
    private double calSellPrice(double buyPrice, double quantity, double shippingFee) {
        return roundDouble(buyPrice * quantity + shippingFee);
    }
    private double calTotalPrice(double sellPrice, double quantity) {
        return Math.ceil(sellPrice * 1.02 / quantity / 100) * 100;
    }

    private double roundDouble(double n) {
        long x  = (long)n;
        if (Math.abs(x - n) >= 0.5) {
            return x + 1;
        }
        return x;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + unit + " " + String.format("%.0f", shippingFee) + " " + String.format("%.0f", sellPrice) + " " + String.format("%.0f", totalPrice);
    }

}

class CompareByTotalPrice implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        if (a.getTotalPrice() < b.getTotalPrice()) {
            return 1;
        } 
        return -1;
    }
}