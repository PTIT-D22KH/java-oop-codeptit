package J07045;

import java.util.Comparator;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id, name;
    private double singlePrice, serviceFee;

    public LoaiPhong(String s) {
        String temp[] = s.trim().split("\\s+");
        this.id = temp[0];
        this.name = temp[1];
        this.singlePrice = Double.parseDouble(temp[2]);
        this.serviceFee = Double.parseDouble(temp[3]);
    }
   

    public String getName() {
        return name;
    }
    @Override
    public int compareTo(LoaiPhong other) {
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + String.format("%.0f", singlePrice) + " " + serviceFee;
    }
}
