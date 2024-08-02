package j06001;

// import java.util.Map;

public class Bill {
    private String id, name;
    private Product product;
    private double quantity, discount, basicPrice,  finalPrice;
    // private int type;
    
    private static int count = 0;


    public Bill(String inputId, double quantity) {
        count++;
        this.id = inputId + "-" + String.format("%03d", count);
        String productId = inputId.substring(0, 2);
        this.product = Product.getProductMap().get(productId);
        // System.out.println(product);
        // System.out.println(Integer.valueOf(inputId.charAt(2)) - '0');
        this.product.setType(Integer.valueOf(inputId.charAt(2)) - '0');
        this.quantity = quantity;
        this.name = this.product.getName();
        // System.out.println("Name: " + name);
        this.basicPrice = calBasicPrice();
        // System.out.println("basicPrice: " + basicPrice);
        this.discount = calDiscount();
        // System.out.println("Discount: " + discount);
        this.finalPrice = calFinalPrice();
        // System.out.println("Final Price: " + finalPrice);
    }
    private double calBasicPrice() {
        if (this.product.getType() == 1) {
            return this.product.getPrice1() * quantity;
        } else if (this.product.getType() == 2) {
            return this.product.getPrice2() * quantity;
        }
        return 0;
        
    }
    private double calDiscount() {
        if (quantity >= 150) {
            return 0.5 * basicPrice;
        } else if (quantity >= 100) {
            return 0.3 * basicPrice;
        } else if (quantity >= 50) {
            return 0.15 * basicPrice;
        }
        return 0;
    }
    private double calFinalPrice() {
        return basicPrice - discount;
    }
    @Override
    public String toString(){ 
        return String.format("%s %s %.0f %.0f", id, name, discount, finalPrice);
    }
}
