package J07048;

import java.util.Comparator;

public class Product {
    private String id, name;
    private int price, warranty;
    public Product(String id, String name, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }
    public String getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + warranty;
    }
}
class CompareByPriceDescAndIdAsc implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        int cmpPrice = Integer.compare(b.getPrice(), a.getPrice());
        if (cmpPrice == 0) {
            return a.getId().compareTo(b.getId());
        }
        return cmpPrice;
    }
}