package j07027;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id, name, phoneNumber, group;
    private static Map<String, Student> studentMap = new HashMap<>();

    public Student(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = "0";
        // this.group = group;
        // this.assignmentName = "";
        studentMap.put(id, this);
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public static Map<String, Student> getStudentMap() {
        return studentMap;
    }
    public String getId() {
        return id;
    }
    public String getGroup() {
        return group;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s ", id, name, phoneNumber, group);
    }
}
class CompareById implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getId().compareTo(b.getId());
    }
}
