package J07035;
import java.util.*;
public class Transcript {
    
    private Student student;
    private Course course;
    private String gpa;

    public Transcript(String s) {
        String a[] = s.trim().split("\\s+");
        this.student = Student.getStudentMap().get(a[0]);
        this.course = Course.getCourseMap().get(a[1]);
        this.gpa = a[2];
    }

    
    

    public Transcript(Student student, Course course, String gpa) {
        this.student = student;
        this.course = course;
        this.gpa = gpa;
    }




    public Course getCourse() {
        return course;
    }
    public String getGpa() {
        return gpa;
    }
    public Student getStudent() {
        return student;
    }
    @Override
    public String toString (){ 
        return student.getId() + " " + student.getName() + " " + student.getClassName() + " " + gpa;
    }
}
class CompareByGpaAndId implements Comparator<Transcript> {
    @Override
    public int compare(Transcript a, Transcript b) {
        int cmpGpa = Double.compare(Double.parseDouble(b.getGpa()), Double.parseDouble(a.getGpa()));
        if (cmpGpa == 0) {
            return a.getStudent().getId().compareTo(b.getStudent().getId());
        }
        return cmpGpa;
    }
}