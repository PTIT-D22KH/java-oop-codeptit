package J07060;
import java.text.SimpleDateFormat;
import java.util.*;
public class Section {
    private String day, hour, roomId;
    private Date date;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private Schedule schedule;
    public Section(String day, String hour, String roomId) {
        this.day = day;
        this.hour = hour;
        this.roomId = roomId;
        String date = day + " " + hour;
        try {
            this.date = sd.parse(date);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    public Date getDate() {
        return date;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    @Override
    public String toString() {
        return day + " " + hour + " " + roomId + " " + Course.getCourseMap().get(schedule.getCourseId()).getName() + " " + schedule.getGroup() + " " + schedule.getNumStudents();
    }
    
}
class CompareByDateAndId implements Comparator<Section> {
    @Override
    public int compare(Section a, Section b) {
        int cmpDate = a.getDate().compareTo(b.getDate());
        if (cmpDate == 0) {
            return a.getSchedule().getId().compareTo(b.getSchedule().getId());
        }
        return cmpDate;
    }
}