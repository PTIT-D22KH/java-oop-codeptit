package J05073;

public class Bill {
    private String id;
    private double totalPrice;
    private long numBuy;

    public Bill(String s) {
        String a[] = s.trim().split("\\s+");
        this.id = a[0];
        long singlePrice = Long.parseLong(a[1]);
        this.numBuy = Long.parseLong(a[2]);
    }
}
