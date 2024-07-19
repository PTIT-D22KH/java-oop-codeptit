package j05003;

public class Student{ 
    private String id, name, dob, className;
    private double gpa;
    private static int count = 0;

    public Student() {
        id = name = dob = className = "";
        gpa = 0;
    }
    public Student(String name, String dob, String className, double gpa) {
        this.name = name;
        this.dob = formatDob(dob);
        this.className = className;
        this.gpa = gpa;
        count++;
        String s = String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "B20DCCN0" + s;
    }
    private String formatDob(String dob) {
        String []a = dob.split("/");
        if (a[0].length() == 1) {
            a[0] = "0" + a[0];
        }
        if (a[1].length() == 1) {
            a[1] = "0" + a[1];
        }
        return a[0] + "/" + a[1] + "/" + a[2];
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + dob + " " + String.format("%.2f", gpa);
    }
} 