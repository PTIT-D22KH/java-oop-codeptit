package J05062;

import java.util.Comparator;

public class Student {
    private String name, result;
    private double gpa;
    private int rlScore;
    public Student(String name, String score) {
        this.name = name;
        String a[] = score.trim().split("\\s+");
        this.gpa = Double.parseDouble(a[0]);
        this.rlScore = Integer.parseInt(a[1]);
        // this.result = setResult(double standardGpa);
    }
    public void setResult(double standardGpa) {
        if (gpa >= standardGpa) {
            if (gpa >= 3.6 && rlScore >= 90) {
                this.result = "XUATSAC";
            } else if (gpa >= 3.2 && rlScore >= 80) {
                this.result = "GIOI";
            } else if (gpa >= 2.5 && rlScore >= 70) {
                this.result = "KHA"; 
            } else {
                this.result = "KHONG";
            }
        } else {
            this.result = "KHONG";
        }
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return name + ": " + result;
    }
}
class CompareByGpa implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}