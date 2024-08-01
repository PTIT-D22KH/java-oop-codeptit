package j05035;

import java.util.Comparator;

public class Student {
    private String stt, id, name, className, email, company;
    private static int count = 0;
    public Student(String id, String name, String className, String email, String company) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.company = company;
        count++;
        this.stt = String.valueOf(count);
    }
    public String getCompany() {
        return company;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return stt + " " + id + " " + name + " " + className +  " " + email + " " + company;
    } 
    

}
class CompareById implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getId().compareTo(b.getId());
    }
}