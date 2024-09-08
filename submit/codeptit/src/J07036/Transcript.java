package J07036;

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
        return student.getId() + " " + student.getName() + " " + course.getName() + " " + String.format("%.2f", gpa);
    }
}

class CompareByCourseIdAndStudentId implements Comparator<Transcript> {
    @Override
    public int compare(Transcript a, Transcript b) {
        int cmpCourseId = a.getCourse().getId().compareTo(b.getCourse().getId());
        if (cmpCourseId == 0) {
            return a.getStudent().getId().compareTo(b.getStudent().getId());
        }
        return cmpCourseId;
    }
}