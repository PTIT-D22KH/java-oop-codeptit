package j08011;

import java.util.Comparator;

public class Number {
    private String number;
    private int id, fre;
    private static int count = 0;

    public Number(String number, int fre) {
        this.number = number;
        this.fre = fre;
        count++;
        this.id = count;
    }

    public int getFre() {
        return fre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return number + " " + fre;
    }
}

class CompareByFreDescIdAsc implements Comparator<Number> {
    @Override
    public int compare(Number a, Number b) {
        int res = Integer.compare(b.getFre(), a.getFre());
        if (res == 0) {
            return Integer.compare(a.getId(), b.getId());
        }
        return res;
    }
}