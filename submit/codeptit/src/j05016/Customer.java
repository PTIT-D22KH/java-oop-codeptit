package j05016;

import java.util.Comparator;

public class Customer {
    private String id, name;
    private HotelInfo info;
    private static int count = 0;

    public Customer(String name, String roomId, String checkInString, String checkOutString, long additionalCost) {
        this.name = name;
        this.info = new HotelInfo(roomId, checkInString, checkOutString, additionalCost);
        count++;
        String s= String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "KH" + s;
    }
    public HotelInfo getInfo() {
        return info;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + info;
    }
}
class CompareByTotalCost implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        if (a.getInfo().getTotalCost() < b.getInfo().getTotalCost()) {
            return 1;
        }
        return -1;
     }
}