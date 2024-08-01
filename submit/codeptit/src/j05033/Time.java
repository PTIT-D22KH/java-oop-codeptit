package j05033;

import java.util.Comparator;

public class Time {
    private int hour, minutes, seconds;

    public Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return hour + " "  + minutes + " " + seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    
}
class CompareByTime implements Comparator<Time> {
    @Override
    public int compare(Time a, Time b) {
        if (a.getHour() == b.getHour()) {
            if (a.getMinutes() == b.getMinutes()) {
                if (a.getSeconds() > b.getSeconds()) {
                    return 1;
                }
                return -1;
            } else if (a.getMinutes() > b.getMinutes()) {
                return 1;
            }
            return -1;
             
        } else if (a.getHour() > b.getHour()) {
            return 1;
        }
        return -1;
    }
}