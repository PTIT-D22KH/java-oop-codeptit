package J05082;

import java.text.SimpleDateFormat;
import java.util.*;

public class Customer {
    private String id, name, gender, dob, address;
    private Date birthDay;
    private static int count = 0;

    public Customer(String name, String gender, String dob, String address) {
        this.name = formatName(name);
        this.gender = gender;
        this.dob = normalizeDob(dob);
        this.address = address;
        count++;
        this.id = String.format("KH%03d", count);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDay = sd.parse(this.dob);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String formatName(String name) {
        String[] a = name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String s : a) {
            res.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    private String normalizeDob(String dob) {
        String[] a = dob.trim().split("/");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].length() == 1) {
                res.append("0").append(a[i]);
            } else {
                res.append(a[i]);
            }
            res.append("/");
        }
        res.append(a[a.length - 1]);
        return res.toString();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + address + " " + dob;
    }
}

class CompareByAge implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        return a.getBirthDay().compareTo(b.getBirthDay());
    }
}