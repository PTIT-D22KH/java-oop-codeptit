package j05031;

import java.util.Comparator;

public class Student {
    private String id, name, className;
    private double score1, score2, score3;
    // private static int count = 0;
    public Student(String id, String name, String className, double score1, double score2, double score3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;

    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + className + " " + String.format("%.1f", score1) + " " + String.format("%.1f", score2) + " " + String.format("%.1f", score3);
    }
}
class CompareByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
