package j08011;

import java.util.Comparator;

public class Number {
    private String number;
    private int frequency;
    private int id;
    private static int count = 0;

    public Number(String number, int frequency) {
        this.number = number;
        this.frequency = frequency;
        count++;
        this.id = count;
    }

    public String getNumber() {
        return number;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getId() {
        return id;
    }

    public void incrementFrequency() {
        this.frequency++;
    }

    @Override
    public String toString() {
        return number + " " + frequency;
    }
}

class CompareByFreDescIdAsc implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        int freqCompare = Integer.compare(o2.getFrequency(), o1.getFrequency());
        if (freqCompare == 0) {
            return Integer.compare(o1.getId(), o2.getId());
        }
        return freqCompare;
    }
}