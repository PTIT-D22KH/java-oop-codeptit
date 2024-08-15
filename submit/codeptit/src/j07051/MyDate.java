package j07051;

import java.util.Date;

@SuppressWarnings("deprecation")
public class MyDate extends Date {
    private int day, month, year;

    public MyDate(String s) {
        String[] a = s.split("/");
        this.day = Integer.parseInt(a[0]);
        this.month = Integer.parseInt(a[1]);
        this.year = Integer.parseInt(a[2]);
    }

    public long daysDiff(MyDate o) {
        Date a = new Date(this.year - 1900, this.month - 1, this.day);
        Date b = new Date(o.year - 1900, o.month - 1, o.day);
        return (b.getTime() - a.getTime()) / (3600 * 1000 * 24) + 1;
    }
}