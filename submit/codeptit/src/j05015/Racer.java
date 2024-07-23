package j05015;
import java.util.*;
public class Racer {
    private String id, name, place;
    private Time finishTime;
    private int velocity;
    public final Time startTime = new Time("6:00");

    public Racer(String name, String place, String finishTimeString) {
        this.name = name;
        this.place = place;
        this.id = makeId();
        this.finishTime = new Time(finishTimeString);
        this.velocity = calVelocity();
    }
    private String makeId() {
        String a[] = this.place.split(" ");
        String b[] = this.name.split(" ");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res = res + a[i].charAt(0);
        }
        for (int i = 0; i < b.length; i++) {
            res = res + b[i].charAt(0);
        }
        return res;
    }
    private int calVelocity() {
        // System.out.println(this.finishTime.timeDiff(this.startTime).toHourDecimal());
        double x = this.finishTime.timeDiff(this.startTime).toHourDecimal();
        // System.out.println(x);
        double len = 120;
        double r = len / x;
        int res = Math.round((float)r);
        return res;
    }
    public Time getFinishTime() {
        return finishTime;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + place + " " + velocity + " Km/h";
    }
}
class CompareByFinishTime implements Comparator<Racer> {
    @Override
    public int compare(Racer a, Racer b) {
        if (a.getFinishTime().timeDiff(a.startTime).toTotalMinutes() > b.getFinishTime().timeDiff(b.startTime).toTotalMinutes()) {
            return 1;
        }
        return -1;
    }
}