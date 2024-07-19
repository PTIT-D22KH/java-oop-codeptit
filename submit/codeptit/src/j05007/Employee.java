package j05007;
import java.util.Comparator;
public class Employee {
    private String id, name, gender, dob, address, taxId, contractDate;
    private static int count = 0;
    public static final Comparator<Employee> BY_AGE_DESC = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            int yearA = extractYear(a.dob);
            int yearB = extractYear(b.dob);
            int monthA = extractMonth(a.dob);
            int monthB = extractMonth(b.dob);
            int dayA = extractDay(a.dob);
            int dayB = extractDay(b.dob);
            // Compare years in descending order
            int compareYear = Integer.compare(yearA, yearB);
            if (compareYear == 0) {
                int compareMonth = Integer.compare(monthA, monthB);
                if (compareMonth == 0) {
                    return Integer.compare(dayA, dayB);
                }
                return compareMonth;
            }
            return compareYear;
        }
    };
    private static int extractYear(String dob) {
        return Integer.parseInt(dob.substring(6));
    }
    private static int extractMonth(String dob) {
        return Integer.parseInt(dob.substring(3, 4));
    }
    private static int extractDay(String dob) {
        return Integer.parseInt(dob.substring(0, 1));
    }
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
