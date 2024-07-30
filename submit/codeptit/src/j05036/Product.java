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
        
    }

    

}
