package J07074;
import java.util.*;
public class Section {
    private String id, courseId, lecturerName, room;
    private int weekDay, stt;
    private static int count = 0;
    public Section(String courseId, int weekDay, int stt, String lecturerName, String room) {
        this.courseId = courseId;
        this.lecturerName = lecturerName;
        this.room = room;
        this.weekDay = weekDay;
        this.stt = stt;
        count++;
        this.id = String.format("HP%03d", count);
    }
    public int getWeekDay() {
        return weekDay;
    }
    public String getLecturerName() {
        return lecturerName;
    }
    public String getCourseId() {
        return courseId;
    }
    public int getStt() {
        return stt;
    }
    @Override
    public String toString(){
        return id + " " + weekDay + " " + stt + " " + lecturerName + " " + room;
    }
}
class CompareByTimeAndLectureName implements Comparator<Section> {
    @Override

    public int compare(Section a, Section b) {
        int cmpWeekday = Integer.compare(a.getWeekDay(), b.getWeekDay());
        if (cmpWeekday == 0) {
            int cmpStt = Integer.compare(a.getStt(), b.getStt());
            if (cmpStt == 0) {
                return a.getLecturerName().compareTo(b.getLecturerName());
            }
            return cmpStt;
        }
        return cmpWeekday;
    }
}