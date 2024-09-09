package j07025;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class Customer {
    private String id, name, gender, address, birthDay;
    private Date dob;
    private static int count = 0;

    public Customer(String name, String gender, String birthDay, String address) throws ParseException {
        count++;
        this.id = String.format("KH%03d", count);
        this.name = formatName(name);
        this.gender = gender;
        this.birthDay = formatDob(birthDay);
        this.address = address;
    }
    private String formatName(String name) {
        String a[] = name.trim().split("\\s+");
        // for (String x : a) {
        //     System.out.println(x);
        // }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1).toLowerCase());
            // res += String.valueOf(a[i].toUpperCase().charAt(0)) + a[i].substring(1).toLowerCase();
            if (i != a.length - 1) {
                // res += " ";
                res.append(" ");
            }
        }
        return res.toString();
    }

    private String formatDob(String birthDay) throws ParseException{
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat form = new SimpleDateFormat(dateFormat);
        this.dob = form.parse(birthDay);
        return form.format(this.dob);
        
    }
    public Date getDob() {
        return dob;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + address + " " + birthDay;
    }
    
}
class CompareByAge implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        if (a.getDob().after(b.getDob())) {
            return 1;
            
        }
        return -1;
    }

}