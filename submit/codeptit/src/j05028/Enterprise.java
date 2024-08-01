package j05028;

import java.util.Comparator;

public class Enterprise {
    private String id, name;
    private int capacity;//so sv co the nhan
    public Enterprise(String id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + capacity;
    }
}
class CompareByCapacity implements Comparator<Enterprise> {
    @Override
    public int compare(Enterprise a, Enterprise b) {
        if (a.getCapacity() < b.getCapacity()) {
            return 1;
        }
        return -1;
    }
}