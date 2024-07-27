package j05019;

public class Time {
    private int hour, minutes;
    // private int totalMinutes;

    public Time() {

    }
    public Time(String s) {
        String a[] = s.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
        // this.totalMinutes = timeToTotalMinutes(hour, minutes);
    }

    
    private int timeToTotalMinutes() {
        return hour * 60 + minutes;
    }
    public static double minutesToHourDecimal(int totalMinutes){
        return totalMinutes / 60.0;
    }
    public double minutesToHourDecimal(Time t){
        return t.timeToTotalMinutes() / 60.0;
    }

    private Time timeDiff(Time end) {
        int x = end.hour - this.hour;
        int y = end.minutes - this.minutes;
        if (y < 0) {
            y += 60;
            x--;
        }
        Time res = new Time();
        res.hour = x;
        res.minutes = y;
        return res;
    }

    // public int timeDiffToTotalMinutes(String start, String end) {
    //     Time res = timeDiff(start, end);
    //     return res.timeToTotalMinutes();
    // }

    public int timeDiffToTotalMinutes(Time end) {
        Time res = this.timeDiff(end);
        return res.timeToTotalMinutes();
    }
}
