package J07038;
import java.util.*;
public class Company {
    private String id, name;
    private long numStudents;
    private static Map<String, Company> companyMap = new HashMap<>();
    public Company(String id, String name, long numStudents) {
        this.id = id;
        this.name = name;
        this.numStudents = numStudents;
        Company.companyMap.put(id, this);
    }
    public static Map<String, Company> getCompanyMap() {
        return companyMap;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getNumStudents() {
        return numStudents;
    }
    
}
