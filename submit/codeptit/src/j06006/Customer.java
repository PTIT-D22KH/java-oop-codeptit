package j06006;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String id, name, gender, dob, address;
    private static int count = 0;
    private static Map<String, Customer> customerMap = new HashMap<>();
    public Customer(String name, String gender, String dob, String address) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        count++;
        this.id = String.format("KH%03d", count);
        customerMap.put(id, this);
    }
    public static Map<String, Customer> getCustomerMap() {
        return customerMap;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("%s %s ", name, address);
    }
}
