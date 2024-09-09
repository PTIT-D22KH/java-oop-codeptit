package J07084;

import java.text.SimpleDateFormat;
import java.util.Comparator;

public class Student {
    private String name;
    private long duration;
    public Student(String name, String startTime, String endTime) {
        this.name = name;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            long start = sd.parse(startTime).getTime();
            long end = sd.parse(endTime).getTime();
            this.duration = (end - start) / (1000 * 60);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public long getDuration() {
        return duration;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " " + duration;
    }
    
}
class CompareByDurationAndName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        int cmpDuration = Long.compare(b.getDuration(), a.getDuration());
        if (cmpDuration == 0) {
            return a.getName().compareTo(b.getName());
        }
        return cmpDuration;
    }
}