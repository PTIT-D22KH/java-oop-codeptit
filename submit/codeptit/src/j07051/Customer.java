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
        this.id = String.format("KH%02d", count);
    }

    private String formatName(String name) {
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return res.toString().trim();
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
        return Long.compare(b.getInfo().getTotalCost(), a.getInfo().getTotalCost());
    }
}