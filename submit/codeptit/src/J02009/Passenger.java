package J02009;

import java.util.Comparator;

public class Passenger {
    private int arrivalTime, duration;

    public Passenger(int arrivalTime, int duration) {
        this.arrivalTime = arrivalTime;
        this.duration = duration;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
    
    public int getDuration() {
        return duration;
    }
}

class CompareByArrivalTime implements Comparator<Passenger> {
    @Override
    public int compare(Passenger a, Passenger b) {
        return Integer.compare(a.getArrivalTime(), b.getArrivalTime());
    }
}
