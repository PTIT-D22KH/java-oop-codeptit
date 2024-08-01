package j05047;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Load {
    private String id, name;
    private double quantity, buyPrice, discount, totalPrice, discountPercent;
    private static Map<String, Integer> count = new HashMap<>();
    public Load(String name, double quantity, double buyPrice) {
        this.name = name;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
        this.id = genId(name);
        this.discountPercent = calDiscountPercent();
        this.discount = calDiscount();
        this.totalPrice = calTotalPrice();
    }
    private double calTotalPrice() {
        return buyPrice * quantity - discount;
    }
    private double calDiscount() {
        return buyPrice * quantity * discountPercent;
    }
    private double calDiscountPercent() {
        if (quantity > 10) {
            return 0.05;
        } else if (quantity >= 8) {
            return 0.02;
        } else if (quantity >= 5) {
            return 0.01;
        }
        return 0;
    }
    private String genId(String name) {
        String a[] = name.split(" ");
        String type = String.valueOf(Character.toUpperCase(a[0].charAt(0))) + Character.toUpperCase(a[1].charAt(0));
        int countCurr = 1;
        if (count.containsKey(type)) {
            countCurr = count.get(type) ;
            countCurr++;
            count.replace(type, countCurr);
        } else {
            count.put(type, 1);
        
        }
        return type + String.format("%02d", countCurr);
    }
    public double getDiscount() {
        return discount;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.0f", discount) +  " " + String.format("%.0f", totalPrice);
    }
}
class CompareByDiscount implements Comparator<Load> {
    @Override
    public int compare(Load a, Load b) {
        if (a.getDiscount() < b.getDiscount()) {
            return 1;
        }
        return -1;
    }
}