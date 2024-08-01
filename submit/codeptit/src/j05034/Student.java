package j05034;

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
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return stt + " " + id + " " + name + " " + className +  " " + email + " " + company;
    } 
    

}
class CompareByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}