package j05016;
import java.util.Date;
@SuppressWarnings("deprecation")
public class MyDate {
    private int day,month,year;

    public MyDate(String s) {
        String a[] = s.split("/");
        day = Integer.parseInt(a[0]);
        month = Integer.parseInt(a[1]);
        year = Integer.parseInt(a[2]);
    }
    public long daysDiff(MyDate o) {
        Date a = new Date(this.year, this.month, this.day);
        Date b = new Date(o.year, o.month, o.day);
        return (b.getTime() - a.getTime()) / (3600 * 1000 * 24) + 1;
    }
}
