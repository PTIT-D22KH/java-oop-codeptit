package j04007;

public class Employee {
    private String id, name, gender, dob, address, taxId, contractDate;

    public Employee(String name, String gender, String dob, String address, String taxId, String contractDate) {
        this.id = "00001";
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxId = taxId;
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + taxId + " " + contractDate;
    }

    
}
