package j04006;

public class Student {
    private String id, name, className, dob;
    private double gpa;
    
    public Student() {
        name = className = dob = "";
        gpa = 0;
    }
    public Student(String name, String className, String dob, double gpa) {
        this.id = "B20DCCN001";
        this.name = name;
        this.className = className;
        this.dob = formatDob(dob);
        this.gpa = gpa;
    }
    private String formatDob(String dob) {
        String new_dob = "";
        if (dob.charAt(2) != '/') {
            new_dob = "0" + dob;
        }
        if (new_dob.charAt(5) != '/') {
            new_dob = new_dob.substring(0, 3) + "0" + new_dob.substring(3); 
        }
        return new_dob;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + dob + " " +  String.format("%.2f", gpa);
    }
}
