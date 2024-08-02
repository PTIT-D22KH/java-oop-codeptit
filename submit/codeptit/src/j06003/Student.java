package j06003;

import java.util.Map;

public class Student {
    private String id, name, phoneNumber, group;
    // private static Map<String, String> assignmentName;

    public Student(String id, String name, String phoneNumber, String group) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
        // this.assignmentName = "";
    }

    // public void setAssignmentName(String assignmentName) {
    //     this.assignmentName = assignmentName;
    // }
    public String getGroup() {
        return group;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, phoneNumber);
    }
}
