package J07018;
import java.util.*;
public class Student {
    private String id, name, className, dob;
    private double gpa;
    private static int count = 0;
    public Student(String name, String className, String dob, double gpa) {
        this.name = formatName(name);
        this.className = className;
        this.dob = formatDob(dob);
        this.gpa = gpa;
        count++;
        this.id = String.format("B20DCCN%03d", count);
    }
    private String formatName(String name) {
        String a[] = name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a) {
            res.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return res.toString().trim();
    } 
    private String formatDob(String dob) {
        String a[] = dob.trim().split("/");
        int n = a.length;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            if (a[i].length() == 1) {
                res.append("0").append(a[i]);
            } else {
                res.append(a[i]);
            }
            res.append("/");
        }
        res.append(a[n - 1]);
        return res.toString().trim();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + dob + String.format(" %.2f", gpa);
    }
    
}
