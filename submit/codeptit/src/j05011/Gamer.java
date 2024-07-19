package j05011;

import java.util.Comparator;

public class Gamer {
    private String id, name;
    private Time inTime, outTime, playingTime;
    public static final Comparator<Gamer> BY_PLAY_TIME_DESC = new Comparator<Gamer>() {
        @Override
        public int compare(Gamer a, Gamer b) {
            int compareHour = Integer.compare(b.playingTime.getHour(), a.playingTime.getHour());
            if (compareHour == 0) {
                return Integer.compare(b.playingTime.getMinutes(), a.playingTime.getMinutes());
            }
            return compareHour;
        }
    };
    public Gamer(String id, String name, String inTimeString, String outTimeString) {
        this.id = id;
        this.name = name;
        this.inTime = new Time(inTimeString);
        this.outTime = new Time(outTimeString);
        this.playingTime = inTime.timeDifference(outTime);

    }
    @Override
    public String toString() {
        return id + " " + name + " " + playingTime;
    }
}
