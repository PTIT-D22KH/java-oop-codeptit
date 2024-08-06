package j07051;
import java.util.Comparator;

public class Customer {
    private String id, name;
    private HotelInfo info;
    private static int count = 0;

    public Customer(String name, String roomId, String checkInString, String checkOutString, long additionalCost) {
        this.name = formatName(name);
        this.info = new HotelInfo(roomId, checkInString, checkOutString, additionalCost);
        count++;
        String s= String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "KH" + s;
    }
    private String formatName(String name) {
        name = name.toLowerCase();
        String a[] = name.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1));
            if (i != a.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
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