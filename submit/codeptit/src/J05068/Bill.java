package J05068;
import java.util.*;
public class Bill {
    private String id;
    private long numBuy, basicCost, tax, totalCost;
    private Petrol petrol;

    public Bill(String s) {
        String a[] = s.trim().split("\\s+");
        this.id = a[0];
        this.numBuy = Long.parseLong(a[1]);
        this.petrol = new Petrol(a[0]);
        this.basicCost = petrol.getSinglePrice() * numBuy;
        this.tax = (long)(petrol.getTax() * basicCost);
        this.totalCost = this.basicCost + this.tax;
    }
    public long getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString(){ 
        return id + " " + petrol + " " + tax + " " + totalCost;
    }

}
class CompareByTotalCost implements Comparator<Bill> {
    @Override
    public int compare(Bill a, Bill b) {
        return Long.compare(b.getTotalCost(), a.getTotalCost());
    }
}