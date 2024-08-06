package j07010;

public class Student {
    private String id, name, className, dob;
    private double gpa;
    private static int count = 0;
    public Student(String name, String className, String dob, double gpa) {
        this.name = name;
        this.className = className;
        this.dob = formatDob(dob);
        this.gpa = gpa;
        count++;
        this.id = String.format("B20DCCN%03d", count);
    }

    private String formatDob(String dob) {
        String res = dob;
        if (dob.charAt(2) != '/') {
            res = "0" + res;
        }
        if (dob.charAt(5) != '/') {
            res = res.substring(0, 3) + "0" + res.substring(3);

        }
        return res;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + dob + " " + String.format("%.2f", gpa);
    }
    
}
