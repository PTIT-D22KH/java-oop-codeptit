package J07034;

import java.util.Comparator;

public class Course {
    private String id, name;
    private int numberOfCredits;
    public Course(String id, String name, int numberOfCredits) {
        this.id = id;
        this.name = name;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + numberOfCredits;
    }

}
class CompareByName implements Comparator<Course> {
    @Override
    public int compare(Course a, Course b) {
        return a.getName().compareTo(b.getName());
    }
} 
