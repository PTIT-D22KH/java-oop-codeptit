package j05036;

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

    }
    private double calShippingFee(double buyPrice, double quantity) {
        return roundDouble(buyPrice * quantity * 0.05);
    }

    private double roundDouble(double n) {
        long x  = (long)n;
        if (Math.abs(x - n) >= 0.5) {
            return x + 1;
        }
        return x;
    }
    

}
