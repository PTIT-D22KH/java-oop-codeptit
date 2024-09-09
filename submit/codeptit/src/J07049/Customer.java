package J07049;
import java.text.SimpleDateFormat;
import java.util.*;
public class Customer {
    private String id, name, address, productId;
    private long numBuy, totalCost;
    private Date dayBuy, dayExpiredWarranty;
    private String dayExpired;
    private Product product;
    private static int count = 0;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    public Customer(String name, String address, String productId, long numBuy, String dayBuy) {
        this.name = name;
        this.address = address;
        this.productId = productId;
        this.numBuy = numBuy;
        count++;
        this.id = String.format("KH%02d", count);
        
        try {
            this.dayBuy = sd.parse(dayBuy);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        this.product = Product.getProductMap().get(productId);
        // this.dayBuy = dayBuy;
        calDayExpiredWarranty(dayBuy);
        this.totalCost = numBuy * this.product.getSinglePrice();
    }
    private void calDayExpiredWarranty(String dayBuy) {
        String a[] = dayBuy.trim().split("/");
        long m = Long.parseLong(a[1]);
        long y = Long.parseLong(a[2]);
        m += this.product.getWarranty();
        y += m / 12;
        m %= 12;
        if (m == 0) {
            m = (long)12;
            y--;
        }
        String dayExpiredWarranty = String.format("%s/%02d/%04d", a[0], m, y);
        this.dayExpired = dayExpiredWarranty;
        try {
            this.dayExpiredWarranty = sd.parse(dayExpiredWarranty);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
    public Date getDayExpiredWarranty() {
        return dayExpiredWarranty;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + address + " " + productId + " " + totalCost + " " + dayExpired;
    }

    
}
class CompareByExpiredWarrantyAndCustomerId implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        int cmpExpired = a.getDayExpiredWarranty().compareTo(b.getDayExpiredWarranty());
        if (cmpExpired == 0) {
            return a.getId().compareTo(b.getId());
        }
        return cmpExpired;
    }
}