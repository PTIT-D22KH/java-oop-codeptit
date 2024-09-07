package J07035;

import java.util.*;

public class Transcript {
    private Course course;
    private Student student;
    private double gpa;

    public Transcript(String s) {
        String[] a = s.trim().split("\\s+");
        this.student = Student.getStudentMap().get(a[0]);
        this.course = Course.getCourseMap().get(a[1]);
        this.gpa = Double.parseDouble(a[2]);
    }

    public Course getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return student.getId() + " " + student.getName() + " " + student.getClassName() + " " + String.format("%.1f", gpa);
    }
}

class CompareByGpaAndId implements Comparator<Transcript> {
    @Override
    public int compare(Transcript a, Transcript b) {
        int cmpGpa = Double.compare(b.getGpa(), a.getGpa());
        if (cmpGpa == 0) {
            return a.getStudent().getId().compareTo(b.getStudent().getId());
        }
        return cmpGpa;
    }
}