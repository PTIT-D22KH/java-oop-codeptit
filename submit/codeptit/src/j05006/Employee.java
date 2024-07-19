package j05006;

public class Employee {
    private String id, name, gender, dob, address, taxId, contractDate;
    private static int count = 0;
    public Employee(String name, String gender, String dob, String address, String taxId, String contractDate) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxId = taxId;
        this.contractDate = contractDate;
        count++;
        String s = String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "000" + s;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + taxId + " " + contractDate;
    }
    
}
