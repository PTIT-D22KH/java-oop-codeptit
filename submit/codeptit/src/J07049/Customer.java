package J07049;
import java.text.SimpleDateFormat;
import java.util.*;
public class Customer {
    private String id, name, address, productId;
    private long numBuy;
    private Date dayBuy, dayExpiredWarranty;
    private Product product;
    private static int count = 0;
    public Customer(String name, String address, String productId, long numBuy, String dayBuy) {
        this.name = name;
        this.address = address;
        this.productId = productId;
        this.numBuy = numBuy;
        count++;
        this.id = String.format("KH%02d", count);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dayBuy = sd.parse(dayBuy);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        this.product = Product.getProductMap().get(productId);
        // this.dayBuy = dayBuy;
    }

    
}
