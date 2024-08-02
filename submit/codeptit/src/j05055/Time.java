package j05055;

public class Time {
    private int hour, minutes, seconds;

    public Time(String s) {
        String[] a = s.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
        this.seconds = Integer.parseInt(a[2]);
    }

    public Time() {
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

    public Time timeDiff(Time o) {
        int x = o.hour - this.hour;
        int y = o.minutes - this.minutes;
        int z = o.seconds - this.seconds;
        if (x < 0) {
            x = -1 * x;
            y = this.minutes - o.minutes;
            z = this.seconds - o.seconds;
        }
        if (z < 0) {
            y--;
            z += 60;
        }
        if (y < 0) {
            x--;
            y += 60;
        }
        Time res = new Time();
        res.hour = x;
        res.minutes = y;
        res.seconds = z;
        return res;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }
}