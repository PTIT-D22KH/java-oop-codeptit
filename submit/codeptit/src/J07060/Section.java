package J07060;

import java.text.SimpleDateFormat;
import java.util.*;

public class Section {
    private String id, day, hour, roomId;
    private static int count = 0;
    private Date date;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private Schedule schedule;

    public Section(String day, String hour, String roomId) {
        this.day = day;
        this.hour = hour;
        this.roomId = roomId;
        String date = day + " " + hour;
        try {
            this.date = sd.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        count++;
        this.id = String.format("C%03d", count);
        this.schedule = Schedule.getScheduleMap().get(this.id);
    }

    // public void setSchedule(String id) {
    //     this.schedule = Schedule.getScheduleMap().get(id);
    // }

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