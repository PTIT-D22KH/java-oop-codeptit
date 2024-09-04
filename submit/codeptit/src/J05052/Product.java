package J05052;

public class Product {
    private String name;
    private int singlePrice;
    public Product(String name, int singlePrice) {
        this.name = name;
        this.singlePrice = singlePrice;
    }
    public String getName() {
        return name;
    }
    public int getSinglePrice() {
        return singlePrice;
    }
}
