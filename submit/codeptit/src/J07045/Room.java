package J07045;

import java.util.Comparator;

public class Room {
    private String id, name;
    private double singlePrice, serviceFee;
    public Room(String id, String name, double singlePrice, double serviceFee) {
        this.id = id;
        this.name = name;
        this.singlePrice = singlePrice;
        this.serviceFee = serviceFee;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){ 
        return id + " " + name + " " + String.format("%.0f", singlePrice) + " " + serviceFee;
    }
}
class CompareByName implements Comparator<Room> {
    @Override
    public int compare(Room a, Room b) {
        return a.getName().compareTo(b.getName());
    }
}