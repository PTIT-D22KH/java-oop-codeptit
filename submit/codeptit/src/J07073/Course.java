package J07073;
import java.util.*;
public class Course {
    private String id, name, ltType, thType;
    private int numOfCredits;

    public Course(String id, String name, int numOfCredits, String ltType, String thType) {
        this.id = id;
        this.name = name;
        this.numOfCredits = numOfCredits;
        this.ltType = ltType;
        this.thType = thType;
    }

    public  boolean isOnlinePractice() {
        if (this.thType.equals("Truc tuyen") || this.thType.contains("ptit.edu.vn")) {
            return true;
        }
        return false;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + numOfCredits + " " + ltType + " " + thType;
    }

    
}
class CompareById implements Comparator<Course> {
    @Override
    public int compare(Course a, Course b) {
        return a.getId().compareTo(b.getId());
    }

}