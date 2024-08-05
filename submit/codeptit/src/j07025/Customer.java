package j07025;

public class Customer {
    private String id, name, gender, dob, address;
    private static int count = 0;

    public Customer(String name, String gender, String dob, String address) {
        count++;
        this.id = String.format("KH%03d", count);
        this.name = formatName(name);
        this.gender = gender;
        this.dob = formatDob(dob);
        this.address = address;
    }
    private String formatName(String name) {
        String a[] = name.split(" ");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += String.valueOf(a[i].toUpperCase().charAt(0)) + a[i].substring(1)
            if (i != a.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    private String formatDob(String dob) {
        String res = dob;
        if (dob.charAt(2) != '/') {
            res = "0" + res;
        }
        if (dob.charAt(5) != ) {
            res = res.substring(0, 3) + "0" + res.substring(3);
        }
        return res;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + address + " " + dob;
    }
    
}
