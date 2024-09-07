package J05012;

public class Product {
    private String id, name;
    private long singlePrice;
    public Product(String id, String name, long singlePrice) {
        this.id = id;
        this.name = name;
        this.singlePrice = singlePrice;
    }
    public String getId() {
        return id;
    }
    
    public long getSinglePrice() {
        return singlePrice;
    }
    public String getName() {
        return name;
    }
    

    
}
