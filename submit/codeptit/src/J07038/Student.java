package J07038;
import java.util.*;
public class Student {
    private String id, name, className, email;
    private Company internCompany;
    // private static int count = 0;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = formatName(name);
        this.className = className;
        this.email = email;
        
    }
    private String formatName(String name) {
        String a[] = name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a) {
            res.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return res.toString().trim();
        
    }
    public void setInternCompany(Company internCompany) {
        this.internCompany = internCompany;
    }
    public Company getInternCompany() {
        return internCompany;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString(){ 
        return id + " " + name + " " + className;
    }
}
class CompareById implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getId().compareTo(b.getId());
    }
}